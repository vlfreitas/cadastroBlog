<%@ page language="java" contentType="text/html; charset = UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Cadastro de blog</title>
</head>
<body>
	<form method="post" action="/pessoa">
		<table>
			<tr>
				<td><label>Nome blog:</label></td>
				<td><input type="text" name="nome"/></td>
			</tr>
			<tr>
				<td><label>Site:</label></td>
				<td><input type="text" name="site"/></td>
			</tr>
		</table>
		<input type="submit" value="Cadastrar" />
	</form>

	<br>
	<br>
</body>
</html>