<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<span style = "color:red">
	<% out.println(session.isNew()); %>
	<% session.setAttribute("thirdAtr", "I visited third jsp"); %>
	
</span>
<p>
	<% out.println(session.getId()); %>
</p>
<p>
	<% out.println(session.getAttribute("firstAtr"));
	out.println(session.getAttribute("secondAtr"));
	%>
</p>
<a href = "sessionServlet"> Next </a>
</body>
</html>