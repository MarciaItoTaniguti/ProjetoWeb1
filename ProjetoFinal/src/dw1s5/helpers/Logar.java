package dw1s5.helpers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dw1s5.daos.UsuarioDAO;
import dw1s5.model.Usuario;

public class Logar  implements Comando{

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		Usuario usuarioEncontrado = null;

		try{
			UsuarioDAO usuarioDao = new UsuarioDAO();
			List<Usuario> usuarios = usuarioDao.listar();
			
			for(Usuario u : usuarios){
				if(u.getEmail().equals(login) && u.getSenha().equals(senha)){
					usuarioEncontrado = u;
				}
			}			
			if(usuarioEncontrado != null){
				HttpSession session = request.getSession();
				session.setAttribute("usuario", usuarioEncontrado);

				if(usuarioEncontrado.getTipo()){//true - admin, false - aluno
					return "/administrador.jsp";
				}
				else{
					return "/aluno.jsp";
				}
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		return "/login.jsp";

		/*if(usuarioEncontrado == null){
			//response.sendRedirect(request.getContextPath + "/login.jsp");
			return "/login.jsp";
		}
		else{
			HttpSession session = request.getSession();
			session.setAttribute("usuario", usuarioEncontrado);

			if(usuarioEncontrado.getTipo() == 1){
				response.sendRedirect(request.getContextPath()+"/administrador.jsp");
			}
		}*/
	}
}
/*http://www.guj.com.br/t/gravar-e-buscar-imagem-no-banco-de-dados-resolvido/131492/7*/