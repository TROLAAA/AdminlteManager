package com.datong.controller;

import com.datong.common.GsonUtil;
import com.datong.entity.Sales;
import com.datong.service.SalesService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/SalesServlet/*")
public class SalesServlet extends HttpServlet {

    private SalesService salesService = new SalesService();
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pathInfo = request.getPathInfo().substring(1);
        if("query".equals(pathInfo)){
            query(request,response);
        }
    }


    private void query(HttpServletRequest request, HttpServletResponse response) {
        response.setCharacterEncoding("UTF-8");
        try {
            List<Sales> stolist =  salesService.query();
            System.out.println(stolist);
            response.getWriter().print(GsonUtil.toJson(stolist));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}