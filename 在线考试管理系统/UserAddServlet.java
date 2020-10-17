package com.bjpowernode.controller;

import com.bjpowernode.dao.UserDao;
import com.bjpowernode.entity.Users;

import java.io.IOException;
import java.io.PrintWriter;

public class UserAddServlet extends javax.servlet.http.HttpServlet {

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String userName,password,sex,email;
        UserDao dao = new UserDao();
        Users user = null;
        int result = 0;
        PrintWriter out;

        userName = request.getParameter("userName");
        password = request.getParameter("password");
        sex = request.getParameter("sex");
        email = request.getParameter("email");

        user = new Users(null,userName,password,sex,email);
        dao.add(user);
        
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if (result == 1){
            out.print("<font style ='color:red;font-size:40'>用户信息注册成功</font>");
        }else {
            out.print("<font style ='color:red;font-size:40'>用户信息注册失败</font>");
        }
    }
}
