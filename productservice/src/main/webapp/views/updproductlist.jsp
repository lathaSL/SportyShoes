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

<b>Edit Product details and update</b>

<form action="updateproduct">	
	<table width="80%">
 <th>
				<tr><td>Product Id</td><td><b>Product Name</b></td><td><b>Category</b></td>
				<td><b>Size</b></td><td><b>Prize</b></td>
			</tr>
			</th>
		
		   <tr>
		   		<td><input type="hidden" name="productId" value="${product.productId}">${product.productId}</td>
				<td><input type="text" name="productName" value="${product.productName}"></input></td>
				<td><input type="text" name="category" value="${product.category}"></input></td>
				<td><input type="text" name="size" value="${product.size}"></input></td>
				<td><input type="text" name="price" value="${product.price}"></input></td>
			</tr>
			
 		<tr><td><input type="submit" value="Update"/>	</td>
		<td>	<input type="reset" value="Reset"/></td></tr>
		
		</table>
	</form></body>
</html>