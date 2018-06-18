function validaSenha(){
	var form = document.formAlteraSenha;

	var novasenha = form.nsenha.value;
	var senharep = form.senharep.value;

	if(novasenha == "" || senharep == ""){
		alert("Preencha todos os campos.");
		form.nsenha.focus();
		return false;
	}

	if(!novasenha.equals(senharep)){
		alert("Senhas diferentes. Digite novamente.");
		/*form.nsenha.focus();*/
		document.getElementById("s2").focus();
		document.getElementById("s2").select();
		return false;
	}

	alert("Senha alterada com sucesso.");
	return true;
}