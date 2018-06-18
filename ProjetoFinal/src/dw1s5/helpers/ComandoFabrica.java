package dw1s5.helpers;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class ComandoFabrica {

	public Comando getComando(HttpServletRequest request,ServletContext context) {
		
		String acao = request.getParameter("btnSubmit");
		String nomeClasse = context.getInitParameter(acao);
		
		try {
			
			Class<?> clazz =Class.forName(nomeClasse);
			Object obj = clazz.newInstance();
			Comando comando = (Comando)obj;
			return comando;
		
		}catch(Exception erro) {
			throw new RuntimeException(erro);
		}
		
	}
	

}
