package dw1s5.helpers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Comando {

	public abstract String executa(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	
}