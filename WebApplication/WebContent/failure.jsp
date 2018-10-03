<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login failed</title>
</head>
<body>
<h2 style= "color:red">Failure</h2>
<span style = "color:red">
<%
	out.println(request.getAttribute("errMsg"));
	
%>
</span>

<br>
<a href="index.html"> Try Again </a>
</body>
</html>