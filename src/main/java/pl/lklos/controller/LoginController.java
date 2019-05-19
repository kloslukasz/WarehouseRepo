package pl.lklos.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginPanel", value="/login")
public class LoginController extends HttpServlet {

    private static final String user = "aaa";
    private static final String password = "bbb";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String enterUsername = req.getParameter("username");
        String enterPassword = req.getParameter("password");

        if(user.equals(enterUsername) && (password.equals(enterPassword))) {
            resp.sendRedirect("/");
        } else {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }
}
