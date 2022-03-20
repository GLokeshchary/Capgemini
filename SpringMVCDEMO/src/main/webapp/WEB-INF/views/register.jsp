<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to Registration</h1>
	<form:errors path="cus.*"></form:errors>
	<form action="/SpringMVCEMO/show" method="post">
		<table>
			<tr>
				<td>UserName :</td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="text" name="password" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>Contact :</td>
				<td><input type="text" name="contact" /></td>
			</tr>
			<tr>
				<td>City :</td>
				<td><select name="city">
						<option value="Pune">Pune</option>
						<option value="Hyderabad">Hyderabad</option>
						<option value="Benguluru">Benguluru</option>
						<option value="Mumbai">Mumbai</option>
				</select></td>
			</tr>
			<tr>
				<td>Zip code :</td>
				<td><input type="text" name="zipcode" /></td>
			</tr>
		</table>
		<input type="submit" value="Register" />
	</form>

</body>
</html>