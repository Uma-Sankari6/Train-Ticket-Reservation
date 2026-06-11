package com.train;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        
        if(email != null && password != null && password.length() > 0) {
            HttpSession session = req.getSession();
            session.setAttribute("user_email", email);
            session.setAttribute("user_name", email);
            res.sendRedirect("dashboard.jsp");
        } else {
            res.sendRedirect("login.jsp");
        }
    }
}