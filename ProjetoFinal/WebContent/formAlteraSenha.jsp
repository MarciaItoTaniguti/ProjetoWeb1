<%@include file="menu.jsp" %>

		<h3> Alteração de senha</h3>
		<form method="post" action="#" name="formAlteraSenha" onsubmit="validaSenha();">
			<label for = "s">Nova senha:</label>
			<br/>
			<input type="password" name="nsenha" id="s">

			<br/><br/>

			<label for = "s2">Repita sua senha:</label>
			<br/>
			<input type="password" name="senharep" id="s2">

			<br/><br/>

			<input type="submit" name="btnSubmit" value="Alterar Senha">
		</form>

		<script src="js/validaSenha.js"></script>
		
<%@include file = "footer.jsp" %>