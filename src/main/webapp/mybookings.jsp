<%
String user = (String) session.getAttribute("user_email");
if(user == null) {
    response.sendRedirect("login.jsp");
}
%>
<html>
<head><title>My Bookings</title></head>
<body>
<h1>National Ticket Booking Spot</h1>
<hr>
<h2>My Booking History</h2>
<table border="1">
    <tr><th>PNR</th><th>Train No</th><th>Train Name</th><th>Date</th><th>Seats</th><th>Fare</th></tr>
    <tr><td>1234567890</td><td>10101</td><td>Chennai Express</td><td>2026-06-15</td><td>2</td><td>Rs.900</td></tr>
    <tr><td>1234567891</td><td>10102</td><td>Mumbai Express</td><td>2026-06-20</td><td>1</td><td>Rs.1200</td></tr>
</td>
<p><a href="dashboard.jsp">Back to Dashboard</a></p>
</body>
</html>
