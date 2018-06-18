package dw1s5.model;

import java.util.ArrayList;
import java.util.List;

public class GerenciaDisciplina {
	private List<Disciplina> disciplinas;
	
	public GerenciaDisciplina(){
		disciplinas = new ArrayList<>();
	}
	
	public boolean addDisciplina(Disciplina disciplina){
		disciplinas.add(disciplina);
		return true;
	}
	
	public List<Disciplina> getDisciplinas(){
		return disciplinas;
	}
}
