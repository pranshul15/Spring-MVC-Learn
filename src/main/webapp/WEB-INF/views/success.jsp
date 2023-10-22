<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success JSP</title>
</head>
<body>
	${Header }
	<hr>
	<h1>Form submitted Successfully</h1>
	<h3>Email id : ${user.useremail }</h3>
	<h3>Name : ${user.username }</h3>
	<h3>Password : ${user.password }</h3>
</body>
</html>