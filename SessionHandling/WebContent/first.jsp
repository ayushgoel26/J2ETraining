<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First</title>
</head>
<body>
<span style = "color:red">
	<% out.println(session.isNew()); 
		session.setAttribute("firstAtr", "I visited first jsp");
		%>
</span>
<p>
	<% out.println(session.getId()); %>
</p>
<a href = "second.jsp"> Next </a>
</body>
</html>