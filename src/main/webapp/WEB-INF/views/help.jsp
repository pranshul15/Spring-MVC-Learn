<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help JSP</title>
</head>
<body>
<h1>This is help JSP file</h1>

<%
	/* String name = (String)request.getAttribute("name");
	Integer roll = (Integer)request.getAttribute("rollnumber");
	java.time.LocalDateTime now = (java.time.LocalDateTime)request.getAttribute("time"); */
%>
<h2>Hello my name is <%-- <%=name%> --%> ${name}</h2>
<h2>My roll no. is <%-- <%=roll%> --%>${rollnumber }</h2>
<h2>Date is <%-- <%=now.toString() %>--%>${time }</h2>

<c:forEach var="item" items="${mark }">
	<%-- <h1>${item }</h1> --%>
	<h1><c:out value="${item }"></c:out></h1>
</c:forEach>

</body>
</html>