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

<b>Change Password:</b>

<form action="updatepwd" method="post">
<table>

	<tr><td>Old Password :</td><td><input type="password" name="currpwd"/></td></tr>
	<tr><td>New Password :</td><td><input type="password" name="newpwd"/></td></tr>
	<tr><td>Re-type New Password :</td><td><input type="password" name="newpwd1"/></td></tr>
	<tr><td><input type="submit" value="Change Password"/></td><td><input type="reset" value="Reset"/></td></tr>
</table>
		
	</form></body>
</html>