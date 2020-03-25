package Server;

import JDBC.database;
import model.Student;
import model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/submit")
public class SubmitHomework extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//设置编码，以防表单提交的内容乱码
        StudentHomework sh= new StudentHomework();
        sh.setStudentId(new Long( req.getParameter("studentId")));
        sh.setHomeworkId(new Long( req.getParameter("homeworkId")));
        sh.setHomeworkContent(req.getParameter("content"));
        sh.setHomeworkTitle(req.getParameter("title"));
        sh.setCreateTime(new java.sql.Date(new java.util.Date().getTime()));


        database.addStudentHomework(sh);

        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }
}
