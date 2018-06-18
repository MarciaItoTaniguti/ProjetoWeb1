function validaForm(){
	var form = document.formCadastro;

	var nome = form.nome.value;
	var dataNasc = form.dataNasc.value;
	var email = form.mail.value;
	var senha = form.senha.value;
	var senharep = form.senharep.value;
	var foto = form.foto.value;
	//debugger;
	
	if(nome == ""){
		alert("Informe seu nome.");
		//form.nome.focus();
		return false;
	}

	if(dataNasc == ""){
		alert("Informe sua data de nascimento.");
		//form.dataNasc.focus();
		return false;
	}

	if(email == ""){
		alert("Informe seu email.");
		//form.mail.focus();
		return false;
	}

	if(senha == ""){
		alert("Informe sua senha.");
		//form.senha.focus();
		return false;
	}

	if(senharep == ""){
		alert("Repita sua senha.");
		//form.senharep.focus();
		return false;
	}

	if(senha != senharep){
		alert("Senhas diferentes. Digite novamente.");
		//form.senha.focus();
		return false;
	}

	if(foto == ""){
		alert("Mande uma fotenha.");
		return false;
	}
	
	var form = document.formCadastro;
	var cpf = formCadastro.cpf.value;

	if(cpf == ""){
		// debugger;
    	alert("Informe seu CPF.");
    	form.cpf.focus();
    	return false;
    }

    if (cpf.length < 11){//se cpf ter menos que 11 dígitos, está incompleto. Validação falha.
    	return false;
    }

    var soma;
    var resto;

    soma = 0;   

    //strCPF  = RetiraCaracteresInvalidos(strCPF,11);
    if (strCPF == "00000000000"){
		return false;
    }

    for (i=1; i<=9; i++){
		soma = soma + parseInt(strCPF.substring(i-1, i)) * (11 - i); 
	}

    resto = (soma * 10) % 11;

    if ((resto == 10) || (resto == 11)) {
		resto = 0;
	}

    if (resto != parseInt(strCPF.substring(9, 10))){
    	return false;
    	soma = 0;
    }
	
    for (i = 1; i <= 10; i++){
       soma = soma + parseInt(strCPF.substring(i-1, i)) * (12 - i);
    }

    resto = (soma * 10) % 11;

    if ((resto == 10) || (resto == 11)) {
		resto = 0;
    }

    if (resto != parseInt(strCPF.substring(10, 11))){
        return false;
    }

	return true;
}

function validaCPF(){
	

    /*var numeros;
    var digitos;
    var soma;
    var i;
    var resultado;
    var; digitos_iguais;

    digitos_iguais = 1;

    
          
    for (i = 0; i < cpf.length - 1; i++){
    	if (cpf.charAt(i) != cpf.charAt(i + 1)){
	        digitos_iguais = 0;
	        break;
        }
    }
          
    if (!digitos_iguais){
		numeros = cpf.substring(0,9);
		digitos = cpf.substring(9);
		soma = 0;

		for (i = 10; i > 1; i--){
		    soma += numeros.charAt(10 - i) * i;
			resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;
		}

		if (resultado != digitos.charAt(0)){
		    return false;
		}

		numeros = cpf.substring(0,10);
		soma = 0;

		for (i = 11; i > 1; i--){
		    soma += numeros.charAt(11 - i) * i;
		}

		resultado = soma % 11 < 2 ? 0 : 11 - soma % 11;

		if (resultado != digitos.charAt(1)){
		    return false;
		}
		return true;
	}
    else{
        return false;
    }*/
}

function formatar(mascara, documento){
  var i = documento.value.length;
  var saida = mascara.substring(0,1);
  var texto = mascara.substring(i)
  
  if (texto.substring(0,1) != saida){
            documento.value += texto.substring(0,1);
  }
  
}