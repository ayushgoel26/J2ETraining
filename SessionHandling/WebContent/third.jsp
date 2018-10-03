<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Third</title>
</head>
<body>
<body>
<span style = "color:red">
	<% out.println(session.isNew()); %>
</span>
<p>
	<% out.println(session.getId()); %>
</p>
<p>
	<% out.println(session.getAttribute("firstAtr"));
	out.println(session.getAttribute("secondAtr"));%>
</p>
<% session.invalidate(); %>
<a href = "fourth.jsp">Next</a>
</body>
</body>
</html>