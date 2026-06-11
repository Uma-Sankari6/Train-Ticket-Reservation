package com.train;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        
        if(name != null && email != null && password != null && name.length() > 0) {
            HttpSession session = req.getSession();
            session.setAttribute("user_email", email);
            session.setAttribute("user_name", name);
            res.sendRedirect("dashboard.jsp");
        } else {
            res.sendRedirect("register.jsp");
        }
    }
}