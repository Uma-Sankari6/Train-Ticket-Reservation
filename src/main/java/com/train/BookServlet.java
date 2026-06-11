package com.train;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/BookServlet")
public class BookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        
        HttpSession session = req.getSession();
        if(session.getAttribute("user_email") == null) {
            res.sendRedirect("login.jsp");
            return;
        }
        
        String trainNo = req.getParameter("trainno");
        String trainName = req.getParameter("trainname");
        String fare = req.getParameter("fare");
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String date = req.getParameter("date");
        String seats = req.getParameter("seats");
        
        int totalFare = Integer.parseInt(fare) * Integer.parseInt(seats);
        long pnr = System.currentTimeMillis();
        
        out.println("<html><head><title>Booking Confirmation</title></head><body>");
        out.println("<h1>National Ticket Booking Spot</h1>");
        out.println("<hr>");
        out.println("<h2>Ticket Booked Successfully!</h2>");
        out.println("<p><strong>PNR Number:</strong> " + pnr + "</p>");
        out.println("<p><strong>Train Number:</strong> " + trainNo + "</p>");
        out.println("<p><strong>Train Name:</strong> " + trainName + "</p>");
        out.println("<p><strong>Passenger Name:</strong> " + name + "</p>");
        out.println("<p><strong>Age:</strong> " + age + "</p>");
        out.println("<p><strong>Journey Date:</strong> " + date + "</p>");
        out.println("<p><strong>Number of Seats:</strong> " + seats + "</p>");
        out.println("<p><strong>Total Fare:</strong> Rs." + totalFare + "</p>");
        out.println("<a href='dashboard.jsp'>Go to Dashboard</a> | <a href='trains.jsp'>Book More</a>");
        out.println("</body></html>");
    }
}