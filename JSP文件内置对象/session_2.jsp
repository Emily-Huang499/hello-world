<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/14
  Time: 15:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Integer value = (Integer)session.getAttribute("key1");
%>
session_2.jsp从当前用户读取的数据<%=value%>
