<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		Partie HTML
		<br>
		<%
         	out.println("Partie JSP");
		%>
		<br>
		<%
			out.println("HELLO WORLD! "+ new java.util.Date());
      	%>
      	
	</body>
</html>