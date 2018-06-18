package dw1s5.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dw1s5.helpers.Comando;
import dw1s5.helpers.ComandoFabrica;

@WebServlet(name = "/ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				request.setCharacterEncoding("UTF-8");
				ServletContext context = getServletContext();				
								
				ComandoFabrica fabrica = new ComandoFabrica();
				Comando comando = fabrica.getComando(request,context);
				try {
					
					String recurso = comando.executa(request, response);
					RequestDispatcher dispatcher = request.getRequestDispatcher(recurso);
					dispatcher.forward(request,response);			
					
				}catch(Exception erro) {
					throw new ServletException(erro);
				}
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
