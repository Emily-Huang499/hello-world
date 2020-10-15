<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/15
  Time: 20:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userName = request.getParameter("userName");
    String password = request.getParameter("password");
%>
访问用户姓名为：<%=userName%>;
访问用户密码为：<%=password%>;
