<html>
<head><title>Book Ticket</title></head>
<body>
<h2>Book Your Ticket</h2>
<form action="BookServlet" method="post">
Train No: <input type="text" name="trainno" value="<%= request.getParameter("trainno") %>" readonly><br><br>
Train Name: <input type="text" name="trainname" value="<%= request.getParameter("trainname") %>" readonly><br><br>
Fare: <input type="text" name="fare" value="<%= request.getParameter("fare") %>" readonly><br><br>
Passenger Name: <input type="text" name="name" required><br><br>
Age: <input type="number" name="age" required><br><br>
Journey Date: <input type="date" name="date" required><br><br>
Number of Seats: <input type="number" name="seats" value="1"><br><br>
<input type="submit" value="Confirm Booking">
</form>
<a href="trains.jsp">Back to Trains</a>
</body>
</html>