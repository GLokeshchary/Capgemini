<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>YOUR FAVOURITE ACTOR:</h1>
	<h2>${msg}</h2>
	<table>
		<tr>
			<td>YOURS NAME :</td>
			<td>${student1.username}</td>
		</tr>
		<tr>
			<td>YOURS FAVOURITE ACTOR :</td>
			<td>${student1.actor}</td>
		</tr>
		<tr>
			<td>YOURS PHONE NUMBER :</td>
			<td>${student1.phno}</td>
		</tr>
		<tr>
			<td>YOURS DATE OF BIRTH:</td>
			<td>${student1.DOB}</td>
		</tr>
		<tr>
			<td>YOURS SKILLS :</td>
			<td>${student1.skills}</td>
		</tr>
		<tr>
			<td>YOURS ADDRESS :</td>
			<td>YOUR CITY : ${student1.add.city}</td>
			<td>YOUR STREET : ${student1.add.street}</td>
			<td>YOUR STATE : ${student1.add.state}</td>
			<td>YOUR PIN : ${student1.add.pin}</td>
		</tr>
	</table>
</body>
</html>