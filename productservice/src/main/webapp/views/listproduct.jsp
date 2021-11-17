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

<b>Products List:</b>

<form>	
	<table width="80%">
 <th>
				<tr><td><b>Product Name</b></td><td><b>Category</b></td>
				<td><b>Size</b></td><td><b>Prize</b></td>
				<td><b>Select</b></td>
			</re>
			</th>
		<c:forEach items="${products}" var="product">
		   <tr>
				<td>${product.productName}</td><td>${product.category}</td>
				<td>${product.size}</td><td>${product.price}</td>
				<td><a href="productupdate?productId=${product.productId}">Update</a></td>
				<td><a href="productdelete?productId=${product.productId}">Delete</a></td>
			</tr>
			
		</c:forEach>
		</table>
	</form></body>
</html>