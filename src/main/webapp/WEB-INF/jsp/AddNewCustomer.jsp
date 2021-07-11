<%@ page 
	language="java" 
	contentType="text/html; charset=ISO-8859-1" 
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head>	
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script language="javascript">
			
			$(document).ready(function(){
				
				$("#txtAge").val("");
				$("#btnAddCustomer").prop('disabled', true);
				
				$('#txtName').on('input',function(e){
					checkInput();
				});
				
				$('#txtAge').on('input',function(e){
					checkInput();
				});
			});	
			
			function checkInput(){
				
				var name = $('#txtName').val();
				var age = $('#txtAge').val();
				
				if(name != "" && age != "" && age > 0) {
				
					$("#btnAddCustomer").prop('disabled', false);
				} else {
					$("#btnAddCustomer").prop('disabled', true);
				}
			}
			
		</script>
	
		<meta charset="ISO-8859-1">
		<title>Add new customer</title>
	</head>
	<body>
		<form:form method="post" modelAttribute="customer" action="/addCustomer">
			<form:label path="name"> Name: </form:label>
			<form:input id="txtName" path="name"/>
			
			<form:label path="age"> Age: </form:label>
			<form:input id="txtAge" path="age"/>
			
			<input id="btnAddCustomer" type="submit" value="submit"/>
		</form:form>
	</body>
</html>