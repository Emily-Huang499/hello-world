<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.bjpowernode.Student" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/14
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Student stu = new Student(10,"mike");
    List list = new ArrayList();
%>

学员编号：<%=stu.getSid()%><br/>
学员姓名：<%=stu.getSname()%>

