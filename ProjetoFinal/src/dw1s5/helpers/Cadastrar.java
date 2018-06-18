package dw1s5.helpers;

import java.time.LocalDate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dw1s5.daos.AlunoDAO;
import dw1s5.daos.UsuarioDAO;
import dw1s5.model.Aluno;

public class Cadastrar implements Comando{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String cpf = request.getParameter("cpf");
		String nome = request.getParameter("nome");
		LocalDate dataNasc = LocalDate.parse(request.getParameter("dataNasc"));
		String senha = request.getParameter("senha");
		String email = request.getParameter("email");

		//Usuario usuario = new Usuario(cpf, nome, email, senha, false);
		Aluno aluno = new Aluno(cpf, nome, email, senha, dataNasc);

		try{
			UsuarioDAO uDAO = new UsuarioDAO();
			AlunoDAO aDAO = new AlunoDAO();

			uDAO.salvar(aluno);
			aDAO.salvar(aluno);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

		return "/login.jsp";
	}
}