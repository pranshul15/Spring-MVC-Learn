<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by Home Controller</h1>
	<h2>url /home</h2>
	
	<%
		String name = (String)request.getAttribute("name");
		Integer id = (Integer)request.getAttribute("id");
		@SuppressWarnings("unchecked")
		java.util.List<String> friends = (java.util.List<String>)request.getAttribute("f");
	%>
	
	<h1>this is <%=name%></h1>
	<h2>this is id : <%=id%></h2>
	<%
		for(String s : friends) {
	%>
		<h1><%=s%></h1>
	<% 
		}
	%>
</body>
</html>