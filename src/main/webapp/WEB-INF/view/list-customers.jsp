<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" 
href="${pageContext.request.contextPath}/resources/css/style.css">
<title>Customers List</title>
</head>
<body>
	<br>
	<div id="wrapper">
		<div id="header">
			<h2>CRM-Customer Relationship Management</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name </th>
					<th>Emil </th>
				</tr>
				
				<c:forEach var="customer" items="${customers}">
					<tr>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
						
						
					</tr>				
				
				</c:forEach>
			</table>
		
		</div>
	
	</div>

</body>
</html>