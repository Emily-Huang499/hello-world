<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/15
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String value = (String)session.getAttribute("skey1");
%>
session_2从当前读取的数据为：<%=value%>

