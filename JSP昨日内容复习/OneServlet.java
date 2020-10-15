package bjpowernode.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OneServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Person p1 = new Person("Emily", "女", 21, 6528);
        Person p2 = new Person("Kris", "男", 30, 2333);
        Person p3 = new Person("Johnny", "男", 28, 1234);
        Person p4 = new Person("Amy", "女", 22, 2345);

        List<Person> plist = new ArrayList<>();
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        plist.add(p4);

        request.setAttribute("key", plist);
        request.getRequestDispatcher("/person_show.jsp").forward(request, response);
    }
}
