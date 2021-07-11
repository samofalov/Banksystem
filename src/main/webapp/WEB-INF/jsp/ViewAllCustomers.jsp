<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>
		<style>
			table, th, td {
			  border: 1px solid black;
			}
			
			table {
				width: 25%;
			}
		</style>
		
		<meta charset="ISO-8859-1">
		<title>Customer List</title>
	</head>
	<body>
		<table>
			<tr>
				<th> Id </th>
				<th> Name </th>
				<th> Age </th>
			</tr>
			
			<c:forEach items="${customerList}" var="customer">
				<tr>
					<td> ${customer.id} </td>
					<td> ${customer.name} </td>
					<td> ${customer.age} </td>
				</tr>
			</c:forEach>
		</table>
		
		<form:form method="get" action="/addCustomer">
			<input type="submit" value="Add new customer"/>
		</form:form>
	</body>
</html>