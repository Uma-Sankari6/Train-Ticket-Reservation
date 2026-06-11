<%
String user = (String) session.getAttribute("user_email");
if(user == null) {
    response.sendRedirect("login.jsp");
}
%>
<html>
<head><title>Dashboard</title></head>
<body>
<h1>National Ticket Booking Spot</h1>
<hr>
<h2>Welcome, <%= session.getAttribute("user_name") %>!</h2>
<br>
<a href="trains.jsp">Book Ticket</a> | 
<a href="mybookings.jsp">My Bookings</a> | 
<a href="LogoutServlet">Logout</a>
<hr>
<p>Select an option from above.</p>
</body>
</html>