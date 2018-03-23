<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Unos klijenta</title>
</head>
<body>

		<h2>Unos klijenta: </h2>
<hr>
		<form action="/SOAP_Moto_WebClient/HomeServlet" method="get"> <br/>
			Ime klijetna: <input type="text" name="ime"> <br/>
			Prezime klijenta: <input type="text" name="prezime"> <br/>
			Adresa: <input type="text" name="adresa"> <br/>
			Telefon: <input type="text" name="telefon"> <br/>
			<input type="submit" value="Unesi vlasnika">
		</form>
		
		<c:if test="${not empty mesage}">
			${mesage }
		</c:if>

</body>
</html>