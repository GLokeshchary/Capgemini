<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="/SpringMVCEMO/i18n?siteLanguage=en">English</a>||
	<a href="/SpringMVCEMO/i18n?siteLanguage=fr">French</a>
	<a href="/SpringMVCEMO/i18n?siteLanguage=vi">Vietnam</a>
	<h1>
		<spring:message code="label.H1" />
	</h1>
	<form action="/SpringMVCEMO/langsubmit" method="post">
		<table>
			<tr>
				<td><spring:message code="label.Username" /></td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td><spring:message code="label.Password" /></td>
				<td><input type="text" name="password"></td>
			</tr>
		</table>
		<input type="submit" value="submit here">
	</form>
	<iframe width="560" height="315"
		src="https://www.youtube.com/embed/m8v-qYaiWzw"
		title="YouTube video player" frameborder="0"
		allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
		allowfullscreen></iframe>
</body>
</html>