<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>	
		<meta charset="ISO-8859-1">
		<title>Add new customer</title>
	</head>
	<body>
		<form:form method="post" modelAttribute="customer" action="/addCustomer">
			<form:label path="name"> Name: </form:label>
			<form:input path="name"/>
			
			<input type="submit" value="submit"/>
			
		</form:form>
	</body>
</html>