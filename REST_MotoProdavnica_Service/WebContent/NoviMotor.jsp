<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Motor</title>
</head>
<body>
	<jsp:useBean id="vlasnici" class="beans.VlasniciBean"/>
	<jsp:useBean id="kategorije" class="beans.KategorijeBean"/>

	<h1>Novi motor</h1>
	<hr>
	<form action="/REST_MotoProdavnica_Service/rest/prodavnica/savucajMotor" method="post">
		Cena: <input type="text" name="cena"> <br>  
		Godiste: <input type="text" name="godiste"> <br>
		Marka: <input type="text" name="marka"> <br>
		Model: <input type="text" name="model"> <br>
		
		Vlasnik: 
		<select name="idvlasnika">
			<c:forEach var="v" items="${vlasnici.sviVlasnici }">
				<option value="${v.idvlasnika }">${v.ime } ${v.prezime }</option>
			</c:forEach>
		</select>
		<br>
		Kategorija: 
		<select name="idkategorije">
			<c:forEach var="k" items="${kategorije.sveKategorije }">
				<option value="${k.idkategorije }">${k.naziv }</option>
			</c:forEach>
		</select>
		<br>
		<input type="submit" value="Sacuvaj motor">
	</form>
	
	<hr>
	<c:if test="${not empty message }">
		${message }
	</c:if>
	<hr>
	
</body>
</html>