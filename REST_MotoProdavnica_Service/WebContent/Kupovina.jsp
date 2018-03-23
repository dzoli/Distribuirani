<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Kupovina</title>
</head>
<body>
	<h1>Kupovina motora</h1>
	<h4>Kupovinom motora dobijate na poklon opremu iz iste kategorije</h4><hr>
	<jsp:useBean id="kategorije" class="beans.KategorijeBean"/>
	
	<form action="/REST_MotoProdavnica_Service/rest/prodavnica/proizvodiIzKategorije" method="get">
		Odaberite kategoriju:
		<select name="idkat">
			<c:forEach var="k" items="${kategorije.sveKategorije }">
				<option value="${k.idkategorije }">${k.naziv}</option>
			</c:forEach>
		</select>
		<input type="submit" value="Prikazi motore">
	</form>	
	<hr>
		<c:if test="${not empty message }">
			${message }
		</c:if>
	<br><hr>

	<c:if test="${not empty motori}">
		<form action="/REST_MotoProdavnica_Service/rest/prodavnica/kupiMotorSaOpremom" method="post">
			<c:forEach var="m" items="${motori }">
				<input type="hidden" name="idMotora" value="${m.idmotora }">
				ID: ${m.idmotora } |
				Godiste: ${m.godiste } |
				Cena: ${m.cena } |
				Marka: ${m.marka } |
				Model: ${m.model } |
				Poklon oprema: 
				<select name="idOpreme">
					<c:forEach var="o" items="${opreme }">
						<option value="${o.idopreme }">${o.naziv} - ${o.opis }</option>
					</c:forEach>
				</select> |
				<input type="submit" value="Kupi motor"> 
				<hr>
			</c:forEach>
		</form>
	</c:if>
	
</body>
</html>