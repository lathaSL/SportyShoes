<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>

<H1>Welcome to Sporty Shoes Portal!!</H1>

<b>Add Product:</b>

<form action="addnewproduct" method="post">	
	<table>
		<tr><td>Enter Name</td><td><input type="text" name="productName"/></td></tr>
<tr><td>Enter Category</td><td><input type="text" name="category"/></td></tr>
<tr><td>Enter Size</td><td><input type="text" name="size"/></td></tr>
<tr><td>Enter Price</td><td><input type="text" name="price"/></td></tr>
<tr><td><input type="submit" value="Add"/>	</td><td>	<input type="reset" value="Reset"/></td></tr>
		</table>
	</form></body>
</html>