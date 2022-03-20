<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>fill the form</title>
</head>
<body>
<form action="/SpringMVCEMO/simplesubmit" method="post">
<table>
<tr>
<td>Principal amount :</td>
<td><input type="text" name="amount"></td>
</tr>
<tr>
<td>No of Years :</td>
<td><input type="text" name="years"></td>
</tr>
<tr>
<td>Rate of interest :</td>
<td><input type="text" name="rate"></td>
</tr>
</table>
<input type="submit" value="submit here">
</form>

</body>
</html>