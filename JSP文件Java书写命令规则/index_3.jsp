<%@ page import="com.bjpowernode.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/14
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Student stu1 = new Student(21,"Emily");
    Student stu2 = new Student(29,"Kris");
    Student stu3 = new Student(28,"Johnny");
%>
一号学生的编号为<%=stu1.getSid()%> 姓名为<%=stu1.getSname()%><br/>
二号学生的编号为<%=stu2.getSid()%> 姓名为<%=stu2.getSname()%><br/>
三号学生的编号为<%=stu3.getSid()%> 姓名为<%=stu3.getSname()%><br/>