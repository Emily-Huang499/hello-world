package com.bjpowernode.controller;

import java.io.IOException;

public class OneServlet extends javax.servlet.http.HttpServlet {
    public OneServlet(){
        System.out.println("OneServlet对象被创建");
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("OneServlet doGet is run...");
    }
}
