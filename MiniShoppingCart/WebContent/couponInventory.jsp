<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<title>Shopping Cart - Coupon</title>
</head>
<body>

	<form class= "form" action = "cart">
		<div class = "form-group">
			<input type = "checkbox" name = "coupon" id = "coupon" value = "Dominos " />
			<label for = "Dominos "> Dominos </label>
		</div>		
		<div class = "form-group">
			<input type = "checkbox" name = "coupon" id = "coupon" value = " INOX  " />
			<label for = "INOX "> INOX </label>
		</div>		
		<div class = "form-group">
			<input type = "checkbox" name = "coupon" id = "coupon" value = "BookMyShow " />
			<label for = "BookMyShow "> Book My Show </label>
		</div>
		<div>
			<input type = "submit" value = "Add" class = "btn btn-danger"/>
		</div>
	</form>
	
	
</body>
</html>