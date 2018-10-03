<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Second</title>
</head>
<body>
<body>
<span style = "color:red">
	<% out.println(session.isNew()); 
		session.setAttribute("secondAtr", "Ivisited second jsp.");
		%>
</span>
<p>
	<% out.println(session.getId()); %>
</p>
<a href = "third.jsp"> Next </a>
</body>
</body>
</html>