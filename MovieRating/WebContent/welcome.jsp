<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	<div><%@ include file="header.html" %></div>
	
	<div><jsp:include page="showReviews.jsp"></jsp:include></div>
	
	<div><jsp:include page = "footer.jsp"></jsp:include></div>
</div>
</body>
</html>