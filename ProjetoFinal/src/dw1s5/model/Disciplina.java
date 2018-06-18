package dw1s5.model;

public class Disciplina {
	private String codigo;
	private String nome;
	private int qtdMaxAlunos;
	
	public Disciplina(String codigo, String nome, int qtdMaxAlunos){
		this.codigo = codigo;
		this.nome = nome;
		this.qtdMaxAlunos = qtdMaxAlunos;
	}
	
	public String getCodigo(){
		return codigo;
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getQtdMaxAluno(){
		return qtdMaxAlunos;
	}
}
