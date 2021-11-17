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

<b>Enter criteria</b>

<form action="getreport">	
	<table>
		<tr><td>Enter Start Date: </td><td><input type="text" name="stdate"/></td></tr>
		<tr><td>Enter End Date: </td><td><input type="text" name="enddate"/></td></tr>
		<tr><td>Select Category: </td><td><select name="category">
		<option value="Men">Men</option>
		<option value="Women">Women</option>
		<option value="Kids">Kids</option>		
		</select>:
	</td></tr>
<tr><td><input type="submit" value="Show Report"/>	</td><td>	<input type="reset" value="Reset"/></td></tr>
		</table>
	</form></body>
</html>