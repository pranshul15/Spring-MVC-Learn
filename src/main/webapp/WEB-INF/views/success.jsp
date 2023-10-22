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
	<h1>Form submitted Successfully</h1>
	<h3>Email id : ${useremail }</h3>
	<h3>Name : ${username }</h3>
	<h3>Password : ${password }</h3>
</body>
</html>