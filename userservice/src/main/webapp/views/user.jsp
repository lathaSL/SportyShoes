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

<b>Admin Login:</b>

<form action="addnewuser" method="post">

	<table>
	
	<tr><td>Enter Name:</td><td><input type="text" name="userName"/></td></tr>
	<tr><td>Enter Phone:</td><td><input type="text" name="contactNo"/></td></tr>
	<tr><td>Enter Email:</td><td><input type="text" name="email"/></td></tr>
	<tr><td>Enter Address:</td><td><input type="text" name="address"/></td></tr>
	<tr><td>Enter City:</td><td><input type="text" name="city"/></td></tr>
	<tr><td>Enter Password:</td><td><input type="password" name="password"/></td></tr>
	<tr><td>Enter Role:</td><td><input type="text" name="role"/></td></tr>
	<tr><td><input type="submit" value="Add User"/>	</td><td>	<input type="reset" value="Reset"/></td></tr>
	</table>
		
	</form></body>
</html>