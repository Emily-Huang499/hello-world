package com.bjpowernode.controller;

import com.bjpowernode.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserDeleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userId;
        UserDao dao = new UserDao();
        userId = request.getParameter("userId");
        int result = 0;
        result = dao.delete(userId);
        PrintWriter out = null;
        response.setContentType("text/html;charset = utf-8");
        out = response.getWriter();
        if (result == 1){
            out.print("<font style ='color:red;font-size:40'>用户信息删除成功</font>");
        }else {
            out.print("<font style ='color:red;font-size:40'>用户信息删除失败</font>");
        }
    }
}
