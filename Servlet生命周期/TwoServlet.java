package com.bjpowernode.controller;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class TwoServlet extends HttpServlet {
    public TwoServlet(){
        System.out.println("TwoServlet的对象被创建");
    }
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("TwoServlet doGet is run...");
    }
}
