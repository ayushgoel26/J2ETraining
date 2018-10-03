<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CART</title>
</head>
<body>
	<h2>Your Cart</h2>
	<ol>
		<li><% out.println(session.getAttribute("book")); %></li>
		<li><%out.println(session.getAttribute("phone"));%></li>
		<li>Coupons<ol type="i"> <%int items = (Integer) session.getAttribute("items");
			for (int i=0;i<items;i++){%>
			<li>
				<%out.println(session.getAttribute("coupon"+i));%>
			</li>
			<%}%>
		</ol></li>
</body>
</html>