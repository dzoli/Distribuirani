<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>

	<h1>Dobro dosli</h1>
	<hr>
	<ul>
		<li><a href="/REST_MotoProdavnica_Service/Kupovina.jsp">Kupovina</a></li>
		<li><a href="/REST_MotoProdavnica_Service/Azuriranje.jsp">Azuriranja</a></li>
	</ul>
	


	<c:if test="${not empty pageContext.request.remoteUser}">
		Logged user: ${pageContext.request.remoteUser}
		<!-- samo ako je ulogovan moze da se izloguje -->
		<br>
		<a href="/REST_MotoProdavnica_Service/logout.jsp">Logout</a>
		<br>
	</c:if>

</body>
</html>