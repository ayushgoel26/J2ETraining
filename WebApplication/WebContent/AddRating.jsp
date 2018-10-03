<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<title>Rate Movie</title>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class = "col-md-6">
<form class= "form" action = "ProcessRating.jsp">
	<div class = "form-group">
		<label for = "movieName">Movie Name: </label>
		<input type = "text" name = "movieName" id= "movieName" class = "form-control"></input>
	</div>
	
	<div class = "form-group">
		<label for = "movieRating">Movie Rating: </label>
		<input type = "number" name = "movieRating" id= "movieRating" max = "5" min = "1" step = "0.5" class = "form-control"></input>
	</div>
	
	<div>
		<input type = "submit" value = "Submit" class = "btn btn-danger"/>
	</div>
	
</form>
</div>
</body>
</html>