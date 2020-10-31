<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/31
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <%
        String result = (String) request.getAttribute("info");
    %>
    <font style="color: red;font-size: 40px">
        <%=result%>
    </font>

</center>
</body>
</html>
