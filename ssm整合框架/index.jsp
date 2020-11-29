<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" +
            request.getServerPort() +
            request.getContextPath() + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>功能入口</title>
    <base href="<%=basePath%>">
</head>
<body>
<div align="center">
    <p>SSM整合例子</p>
    <img src="img/picture1.jpg">
    <table>
        <tr>
            <td><a href="addStudent.jsp">注册学生</a></td>
        </tr>
        <tr>
            <td><a href="listStudent.jsp">查询学生</a></td>
        </tr>
    </table>
</div>
</body>
</html>
