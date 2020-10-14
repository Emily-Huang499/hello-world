package bjpowernode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OneServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Student stu1 = new Student(21,"Emily");
        Student stu2 = new Student(30,"Kris");
        Student stu3 = new Student(28,"Johnny");

        List<Student> list = new ArrayList();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        request.setAttribute("key",list);

        request.getRequestDispatcher("/user_show.jsp").forward(request,response);
    }
}
