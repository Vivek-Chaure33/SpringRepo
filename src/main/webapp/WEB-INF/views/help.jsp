
<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>    
<%-- <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help</title>
</head>
<body>
	<%-- <h1>Help Page</h1>
	<%
		String name=(String)request.getAttribute("name");
		Integer id=(Integer)request.getAttribute("Id");
		LocalDateTime time=(LocalDateTime) request.getAttribute("time");
		
	%>
	<h1>Name:<%=name %></h1>
	<h1>Id:<%=id %></h1>
	<h1>Time:<%=time %></h1> --%>
	<h1>${name}</h1>
	<h1>${Id}</h1>
	<h1>${time}</h1>
	
	<c:forEach var="item" items="${namesList}">
	<h1>${item}</h1>	
		
	</c:forEach>
</body>
</html>