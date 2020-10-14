<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/14
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    int num1 = 100;
    int num2 = 200;
    int num3 = num1 + num2;//数学运算
    int num4 = num2>=num1?num2:num1;//关系运算
    boolean num5 = num2>=200 & num1>=100;//逻辑运算
    if (num2 > num1){ %>
        num2为最大值：<%=num2%>
<%    }else{ %>
        num1为最大值：<%=num1%>
<%}%>
