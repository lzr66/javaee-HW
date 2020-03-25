package Server;

import JDBC.database;
import model.Homework;
import model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addStudent")
public class addStudent extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//设置编码，以防表单提交的内容乱码

        Student student= new Student();
        student.setSname(req.getParameter("name"));
        student.setCreate_time(new java.sql.Date(new java.util.Date().getTime()));

        database.addStudent(student);
        req.setAttribute("type","addStudent");


        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
