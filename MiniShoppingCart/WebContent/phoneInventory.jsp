<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<title>Shopping Cart - Phone</title>
</head>
<body>
	<form class= "form" action = "cart">
		<div class = "form-group">
			<input type = "radio" name = "phone" id = "phone" value = "Iphone" />
			<label for = "Iphone">I-Phone </label>
		</div>
		<div class = "form-group">
			<input type = "radio" name = "phone" id = "phone" value = "Samsung" />
			<label for = "Samsung">Samsung </label>
		</div>		
		<div class = "form-group">
			<input type = "radio" name = "phone" id = "phone"  value = "Dell" />
			<label for = "Dell">Dell</label>
		</div>
        <div>
			<input type = "submit" value = "Add" class = "btn btn-danger"/>
		</div>

	</form>
	
	
</body>
</html>