<%@ page import="bjpowernode.controller.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/10/15
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Person p1 = new Person("Emily","女",21,6528);
    Person p2 = new Person("Kris","男",30,0123);
    Person p3 = new Person("Johnny","男",28,1234);
    Person p4 = new Person("Amy","女",22,2345);

    List<Person> plist = new ArrayList<>();
    plist.add(p1);
    plist.add(p2);
    plist.add(p3);
    plist.add(p4);
%>
<table border="2" align="center" style="color: pink;font-size: 45px">
    <tr>
        <td>用户姓名</td>
        <td>用户性别</td>
        <td>用户年龄</td>
        <td>用户身份证号</td>
    </tr>
    <%
        for(Person p : plist){
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

