<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>submit form</title>
</head>
<body>
<h1>SIMPLE INTEREST</h1>
<form action="">
<table>
<tr>
<td>Principal amount :</td>
<td>${simple.amount}</td>
</tr>
<tr>
<td>No of Years :</td>
<td>${simple.years}</td>
</tr>
<tr>
<td>Rate of interest :</td>
<td>${simple.rate}</td>
</tr>
<tr>
<td>Calculation :</td>
<td>${cal}</td>
</tr>
</table>
</form>

</body>
</html>