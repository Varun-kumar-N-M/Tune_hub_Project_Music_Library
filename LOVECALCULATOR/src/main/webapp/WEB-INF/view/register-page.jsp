<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	<h1 align="center">Register here</h1>
	<hr />
	<form:form action="register-success" method="get"
		modelAttribute="userInforeg">
		<div align="center">
			<p>
				<label>Name: </label>
				<form:input path="name" />
			</p>



			<p>
				<label>User Name: </label>
				<form:input path="userName" />
			</p>

			<p>
				<label>Password: </label>
				<form:password path="password" />
			</p>

			<p>
				<label>Country: </label>
				<form:select path="country">
					<form:option value="Ind" label="India"></form:option>
					<form:option value="USA" label="United state"></form:option>
					<form:option value="soudi" label="soudi arabia"></form:option>
					<form:option value="cn" label="canada"></form:option>
				</form:select>
			</p>
			<p>
				<label>Hobbies: </label> Cricket:
				<form:checkbox path="hobbies" value="cricket" />
				videogame:
				<form:checkbox path="hobbies" value="videogame" />
				Reading:
				<form:checkbox path="hobbies" value="Reading" />
				Travel:
				<form:checkbox path="hobbies" value="Travel" />
			</p>
			<p>
				<label>Gender: </label> Male
				<form:radiobutton path="gender" value="male"/>
				Female
				<form:radiobutton path="gender" value="female"/>

			</p>
			</div>
			<div align="center">
			<h3>Communication: </h3>
			<label >Email</label>
			<form:input path="communicationdto.email"/>
			<label >Phone</label>
			<form:input path="communicationdto.phone"/>
			</div>
			<br/>
			<div align="center">
			<input type="submit" value="Register" />
		</div>
	</form:form>
</body>
</html>
