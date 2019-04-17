package com.datong.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GsonUtil {

    /**
     *  把对象转为json字符串
     * @param o     要转换的对象
     * @param time     时间格式
     * @return
     */
    public static String toJson(Object o,String time){
        return new GsonBuilder().setDateFormat(time).create().toJson(o);
    }

    public static String toJson(Object o){
        return new Gson().toJson(o);
    }

    public static void toWrite(HttpServletResponse response,Object o) throws IOException {
        response.getWriter().print(toJson(o));
    }

    public static void toWrite(HttpServletResponse response,Object o,String time) throws IOException {
        response.getWriter().print(toJson(o,time));
    }

}
