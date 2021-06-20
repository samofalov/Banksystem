<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Add Customer</title>
</head>
	<body>
		<c:url var="add_customer_url" value="/addCustomer" />
		<form:form action="/addCustomer" method="post"
			modelAttribute="customer">
			<form:label path="id">Id: </form:label>
			<form:input type="text" path="id" />
			
			<form:label path="name">Name: </form:label>
			<form:input type="text" path="name" />
			
			<form:label path="age">Age: </form:label>
			<form:input type="text" path="age" />
			
			<input type="submit" value="submit" />
		</form:form>
	</body>
</html>