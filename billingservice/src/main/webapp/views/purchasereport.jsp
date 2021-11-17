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
<table width="90%">
 <th>
	<tr> 
	<td><b>Bill No</b></td><td><b>Bill Date</b></td>
				<td><b>User Name</b></td><td><b>Product Name</b></td><td><b>Size</b></td>
				<td><b>Quantity</b></td><td><b>Price</b></td>
				<td><b>Contact No</b></td>
				<td><b>Email</b></td>
		</tr>	
			</th>
<c:forEach items="${invoices}" var="invoice">
		   <tr>
				<td>${invoice.invoiceNo}</td><td>${invoice.invoDate}</td>
				<td>${invoice.getUserName()}</td><td>${invoice.getProductName()}</td><td>${invoice.getSize()}</td>
				<td>${invoice.quantity}</td>
				<td>${invoice.price}</td>

				<td>${invoice.getContactNo()}</td>
				<td>${invoice.getEmail()}</td>
			</tr>
			
		</c:forEach>
		</table>
</body>
</html>