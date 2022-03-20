<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>fill the form</title>
<style>
select {
	width: 150px;
	margin: 10px;
}

select:focus {
	min-width: 150px;
	width: auto;
}
</style>
</head>
<body>
	
	<!-- <p>
		<a href="/SpringMVCEMO/home/Admission?siteTheme=green">Green</a>
	</p>
	<p>
		<a href="/SpringMVCEMO/home/Admission?siteTheme=red">Red</a>
	</p> -->
	<a href="/SpringMVCEMO/home/Admission?siteLanguage=en">English</a>||
	<a href="/SpringMVCEMO/home/Admission?siteLanguage=fr">French</a>

	<form:errors path="student1.*"></form:errors>
	<form action="/SpringMVCEMO/home/submit.html" method="post">
		<h1>
			<spring:message code="label.h1" />
		</h1>
		<p>
			<spring:message code="label.name" />
			<input type="text" name="username">
		</p>
		<p>
			<spring:message code="label.actor" />
			<input type="text" name="actor">
		</p>
		<p>
			<spring:message code="label.phno" />
			<input type="text" name="phno">
		</p>
		<p>
			<spring:message code="label.DOB" />
			<input type="text" name="DOB">
		</p>
		<p>
			<spring:message code="label.skills" />
			<select name="skills" multiple>
				<option value="java core">java core</option>
				<option value="spring core">spring core</option>
				<option value="spring mvc">spring mvc</option>
			</select>
		</p>
		<p>
			<spring:message code="label.Address" />
		</p>
		<p>
			<spring:message code="label.city" />
			<input type="text" name=add.city>
		</p>
		<p>
			<spring:message code="label.street" />
			<input type="text" name=add.street>
		</p>
		<p>
			<spring:message code="label.state" />
			<input type="text" name=add.state>
		</p>
		<p>
			<spring:message code="label.pin" />
			<input type="text" name=add.pin>
		</p>

		<input type="submit" value="submit here">
	</form>

</body>
</html>