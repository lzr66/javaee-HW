package Server;

import JDBC.database;
import model.StudentHomework;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SelectStudentHomework extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<StudentHomework> list = database.selectAll();
   /*     for (StudentHomework sh : list){
            System.out.println(sh.getHomeworkContent());
        }*/
        req.setAttribute("list",list);
        req.getRequestDispatcher("SelectHomework.jsp").forward(req,resp);
    }

}
