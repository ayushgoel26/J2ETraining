<%@page import="com.training.resources.DonorResource"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src ="js/jquery-1.9.1.js" ></script>
<script type="text/javascript"> 

</script>
</head>
<body>
	<div id = "location" class = "col-md-4" >
		<h2>Location</h2>
		<c:forEach items = "http://localhost:8080/BloodDonorApplication/rest/donor/getLoc" var="city">
		
			<a href = "<c:url value = "http://localhost:8080/BloodDonorApplication/rest/donor/getBloodGroups"/>">${ city}<//a>
			
		</c:forEach>
	</div>
	<div id = "bloodGroups" class = "col-md-4">
		<h2>Blood Groups</h2>
	</div>
	<div id = "donorDetails" class = "col-md-4">
		<h2>Donors Available</h2>
	</div>

</body>
</html>