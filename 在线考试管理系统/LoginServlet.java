package com.bjpowernode.controller;

import com.bjpowernode.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName,password;
        UserDao dao = new UserDao();
        int result = 0;

        userName = request.getParameter("userName");
        password = request.getParameter("password");

        result = dao.login(userName,password);

        if (result == 1){
            HttpSession session = request.getSession();
            response.sendRedirect("/myWeb/index.html");
        }else {
            response.sendRedirect("/myWeb/index_error.html");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
