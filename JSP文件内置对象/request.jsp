<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/14
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--http://localhost:8080/myWeb/request.jsp?userName=Emily&password=123-->

<%

    String userName = request.getParameter("userName");
    String password = request.getParameter("password");

%>
来访用户姓名：<%=userName%><br/>
来访用户密码：<%=password%>

