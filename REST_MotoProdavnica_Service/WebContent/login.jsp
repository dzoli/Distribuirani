<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Pristup ovom resursu zahteva autentifikaciju</h2>
	<FORM action="j_security_check" method="post">
		<P>
			Korisničko ime: <INPUT type="text" name="j_username"><BR>
		<P>
			Lozinka: <INPUT type="password" name="j_password"><BR> <INPUT
				type="submit" value="Send">
		</P>
	</FORM>
</body>
</html>