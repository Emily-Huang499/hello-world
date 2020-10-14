<%@ page import="java.util.List" %>
<%@ page import="bjpowernode.Student" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/14
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Student> list = (List) request.getAttribute("key");
%>
<table border="2" align="center">
    <tr>
        <td>用户编号</td>
        <td>用户姓名</td>
    </tr>
    <%
        for(Student stu : list){
    %>
    <tr>
        <td><%=stu.getSid()%></td>
        <td><%=stu.getSname()%></td>
    </tr>
    <%
        }
    %>
</table>
