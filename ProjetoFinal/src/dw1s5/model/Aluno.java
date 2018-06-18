package dw1s5.model;

import java.time.LocalDate;

public class Aluno extends Usuario{
	private LocalDate dataNasc;
	private boolean aprovado;
	//foto
	//private GerenciaDisciplina disciplinas;
	
	public Aluno(String cpf, String nome, String email, String senha, LocalDate dataNasc){
		super(cpf, nome, email, senha, false);
		this.dataNasc = dataNasc;
		this.setAprovado(false);
		
		//disciplinas = new GerenciaDisciplina();
	}
	
	public LocalDate getDataNasc(){
		return dataNasc;
	}
	
	public boolean getAprovado(){
		return aprovado;
	}
	
	public void setAprovado(boolean aprovado){
		this.aprovado = aprovado;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	public String getCpf() {
		return super.getCpf();
	}
	
	public String getNome() {
		return super.getNome();
	}
	
	public String getEmail() {
		return super.getEmail();
	}
	
	public String getSenha() {
		return super.getSenha();
	}
	
	//procurar exercicio com gerencia alguma coisa
	
}
