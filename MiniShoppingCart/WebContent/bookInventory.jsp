<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Shopping Cart - Book</title>
</head>
<body>
	<h1>Select Book</h1>
	<form class= "form" action = "cart">
		<div class = "form-group">
			<label for = "bookSelect">Book Name: </label>
			<select name = "bookSelect" id= "bookSelect" class = "form-control">
				<option value = "HFJ">Head First Java</option>
				<option value = "HFJSP">Head First JSP</option>
				<option value = "TIJ">Thinking in Java</option>
			</select>
		</div>
		<div>
			<input type = "submit" value = "Add" class = "btn btn-danger"/>
		</div>
	</form>
</body>
</html>