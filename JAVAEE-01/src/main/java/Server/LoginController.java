package Server;

import JDBC.database;
import model.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        user user= new user();
        user.setUsername(req.getParameter("username"));
        user.setPassword(req.getParameter("password"));
        boolean flag=database.login(user);
        if(flag){
            req.getRequestDispatcher("jsp/mainpage.jsp").forward(req,resp);
            System.out.println("登录成功");
        }


    }
}
