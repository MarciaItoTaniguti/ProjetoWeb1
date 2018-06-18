<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<title>Cadastro</title>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/estilo.css">
		<link rel="stylesheet" type="text/css" href="css/estilo-menu.css">
		
	</head>
	<body>
		<h3>Preencha o formulário a seguir para se cadastrar:</h3>

		<!-- <form method="post" action="ServletControlador" name="formCadastro" onsubmit="return validaForm()"> -->
		<form method="post" action="ServletControlador" name="formCadastro">
			<label for = "c">CPF:</label>
			<br/>
			<input type="text" name="cpf" id="c" onkeypress="formatar('###.###.###-##', this)">

			<br/><br/>

			<label for = "nome">Nome:</label>
			<br/>
			<input type="text" name="nome" id="nome">

			<br/><br/>

			<label for = "d">Data de Nascimento:</label>
			<br/>
			<input type="date" name="dataNasc" id="d">

			<br/><br/>

			<label for = "e">E-mail:</label>
			<br/>
			<input type="email" name="email" id="e">

			<br/><br/>

			<label for = "s">Senha:</label>
			<br/>
			<input type="password" name="senha" id="s">

			<br/><br/>

			<label for = "s2">Repita sua senha:</label>
			<br/>
			<input type="password" name="senharep" id="s2">

			<br/><br/>

			<label for = "f">Foto:</label>
			<br/>
			<input type="file" name="foto" id="f">

			<br/><br/>
			<script src="js/validaFormCadastro.js"></script>
			<input type="submit" name="btnSubmit" id="btnSubmit" value="Cadastrar">
		</form>

		
		
<%@include file = "footer.jsp" %>