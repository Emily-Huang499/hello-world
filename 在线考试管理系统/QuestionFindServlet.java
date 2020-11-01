package com.emily.controller;

import com.emily.dao.QuestionDao;
import com.emily.dao.UserDao;
import com.emily.entity.Question;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class QuestionFindServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        QuestionDao dao = new QuestionDao();
        List list = dao.findAll();
        request.setAttribute("key",list);
        request.getRequestDispatcher("question.jsp").forward(request,response);
    }
}
