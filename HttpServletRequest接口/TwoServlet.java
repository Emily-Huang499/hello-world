package com.bjpowernode.controller;

import java.io.IOException;
import java.lang.reflect.Parameter;
import java.util.Enumeration;

public class TwoServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        Enumeration parameterNames = request.getParameterNames();
        while (parameterNames.hasMoreElements()){
            String paramName = (String)parameterNames.nextElement();
            String value = request.getParameter(paramName);
            System.out.println("请求参数名：" + paramName + "请求参数值：" + value);
        }
    }
}
