<%@ page import="java.util.List" %>
<%@ page import="com.emily.entity.Question" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/11/1
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2" align="center">
    <tr>
        <td>题目编号</td>
        <td>题目信息</td>
        <td>A</td>
        <td>B</td>
        <td>C</td>
        <td>D</td>
        <td>正确答案</td>
    </tr>
    <%
        List list = (List) request.getAttribute("key");
        for (int i= 0;i<list.size();i++){
            Question question = (Question) list.get(i);
    %>
        <%
            if (i%2==0){
        %>
            <tr style="background-color: palevioletred">
        <%
            }else {
        %>
            <tr style="background-color: mediumpurple">
        <%
            }
        %>
    <tr>
        <td><%=question.getQuestionId()%></td>
        <td><%=question.getTitle()%></td>
        <td><%=question.getOptionA()%></td>
        <td><%=question.getOptionB()%></td>
        <td><%=question.getOptionC()%></td>
        <td><%=question.getOptionD()%></td>
        <td><%=question.getAnswer()%></td>
    </tr>
    <%
        }
    %>



</table>

</body>
</html>
