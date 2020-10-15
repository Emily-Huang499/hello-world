<%@ page import="java.util.List" %>
<%@ page import="bjpowernode.controller.Person" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/15
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Person> personList = (List)request.getAttribute("key");
%>
<table border="2" align="center" style="background-color: pink">
    <tr>
        <td>用户姓名</td>
        <td>用户性别</td>
        <td>用户年龄</td>
        <td>用户身份证号</td>
    </tr>
    <%
        for (Person p : personList){
    %>
    <tr>
        <td><%=p.getName()%></td>
        <td><%=p.getSex()%></td>
        <td><%=p.getAge()%></td>
        <td><%=p.getIdCard()%></td>
    </tr>
    <%
        }
    %>
</table>