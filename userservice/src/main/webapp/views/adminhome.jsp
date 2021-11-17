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
<div>
  <span>${message}</span>
</div>
<b>Admin Login:</b><br/><br/>
<a href="/user/changepwd">Change Password</a><br/>
<a href="/user/usermgmt">User Management</a><br/>
<a href="/user/manageproducts">Manage Products</a><br/>
<a href="/report/genreports">Purchase Reports</a><br/>



</body>
</html>