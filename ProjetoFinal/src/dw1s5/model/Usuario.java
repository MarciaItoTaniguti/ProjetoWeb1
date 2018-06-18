package dw1s5.model;

public class Usuario {
	private String cpf;
	private String nome;
	private String email;
	private String senha;
	private boolean tipo;//true - admin, false - aluno
	
	public Usuario(String cpf, String nome, String email, String senha, boolean tipo){
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getSenha(){
		return senha;
	}

	public boolean getTipo(){
		return tipo;
	}
}
