package com.emily.controller;

import com.alibaba.fastjson.JSON;
import com.emily.dao.QueryDao;
import com.emily.entity.Province;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class QueryProvinceServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        QueryDao dao = new QueryDao();
        String json = "{}";
        List<Province> provinces =  dao.queryProvinceList();
        if (provinces != null){
            json = JSON.toJSONString(provinces);
        }
        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw = response.getWriter();
        pw.print(json);
        pw.flush();
        pw.close();
    }
}