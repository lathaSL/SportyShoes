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

<b>User Maintenance</b><br/><br/>
<form action="/user/getuser">
Search User: <br/>
Enter User Name: <input type="text" name="uname"/>
<input type="submit" value="Search"/><br/><br/>
</form>
<a href="/user/listusers">List All Users</a><br/>


</body>
</html>