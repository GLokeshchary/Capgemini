<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>!!!!! YOU HAVE REGISTERED SUCCESSFULLY !!!!!</h1>
<h2>-------------DETAILS ARE GIVEN BELOW----------</h2>
<table>
<tr>
<td>Username : </td>
<td>${cus.username}</td>
</tr>
<tr>
<td>Password : </td>
<td>${cus.password}</td>
</tr>
<tr>
<td>Email : </td>
<td>${cus.email}</td>
</tr>
<tr>
<td>Contact : </td>
<td>${cus.contact}</td>
</tr>
<tr>
<td>City : </td>
<td>${cus.city}</td>
</tr>
<tr>
<td>Zipcode : </td>
<td>${cus.zipcode}</td>
</tr>

</table>
</body>
</html>