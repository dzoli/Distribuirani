<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Oprema</title>
</head>
<body>
	<jsp:useBean id="kategorije" class="beans.KategorijeBean"/>

	<h1>Nova oprema</h1>
	<hr>
	<form action="/REST_MotoProdavnica_Service/rest/prodavnica/sacuvajOpremu" method="post">
		Naziv: <input type="text" name="naziv"> <br>  
		Opis: <input type="text" name="opis"> <br>
		Kategorija: 
		<select name="idkategorije">
			<c:forEach var="k" items="${kategorije.sveKategorije }">
				<option value="${k.idkategorije }">${k.naziv }</option>
			</c:forEach>
		</select><br>
		<input type="submit" value="Sacuvaj opremu">
	</form>

	<hr>
	<c:if test="${not empty message }">
		${message }
	</c:if>
	<hr>
</body>
</html>