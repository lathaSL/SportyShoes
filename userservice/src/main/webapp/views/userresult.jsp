<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home page</title>
</head>
<body>

<H1>Welcome to Sporty Shoes Portal!!</H1>
<table width="80%">
 <th><tr>
				<td><b>User Name</b></td><td><b>Contact No</b></td>
				<td><b>Email</b></td><td>Address</b></td>
				<td><b>City</b></td>
			
			</tr></th>
			<tr/>
<c:forEach items="${users}" var="user">
		   <tr>
				<td>${user.userName}</td><td>${user.contactNo}</td>
				<td>${user.email}</td><td>${user.address}</td>
				<td>${user.city}</td>
			</tr>
			
		</c:forEach>
		</table>
</body>
</html>