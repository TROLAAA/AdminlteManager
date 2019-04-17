package com.datong.controller;

import com.datong.common.C3p0Util;
import com.datong.entity.User;
import org.apache.commons.dbutils.handlers.BeanHandler;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/LoginServlet/*")
public class LoginServlet extends HttpServlet {

    /*重写service*/
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) {
        String pathInfo = request.getPathInfo().substring(1);
        if("login".equals(pathInfo)){
            try {
                login(request,response);


            } catch (SQLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ServletException e) {
                e.printStackTrace();
            }
        }
    }

    private void login(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        String loginname = request.getParameter("loginname");
        String password = request.getParameter("password");
        User u = C3p0Util.qr.query("select * from user where loginName = ? and password = ?"
                ,new BeanHandler<>(User.class),loginname,password);
        if( u != null){
            response.sendRedirect("../student/student.html");
        } else {
            response.sendRedirect("../login.html");
        }
    }
}
