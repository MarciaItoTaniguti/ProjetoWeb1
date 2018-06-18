<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Login</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/estilo.css">
		<link rel="stylesheet" type="text/css" href="css/estilo-menu.css">
		
	</head>
	<body>
		<h3>Faça seu login para acessar o sistema:</h3>
	
		<form action = "#" method = "post">
			<label for = "e">E-mail:</label>
			<br/>
			<input type = "email" name = "login" id = "e" required = "required" />
	
			<br/><br/>
	
			<label for = "s">Senha:</label>
			<br/>
			<input type = "password" name = "senha" id = "s" required = "required" />
	
			<br/><br/>
	
			<input type = "submit" name = "btnSubmit" value = "Login" />
	
			<br/><br/>
	
			<label>Primeiro acesso? <a href="cadastro.jsp">Clique aqui</a> e cadastre-se.</label>
			<!-- esqueci minha senha -->
		</form>
		
<%@include file = "footer.jsp" %>