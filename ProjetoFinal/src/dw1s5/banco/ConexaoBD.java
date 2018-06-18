package dw1s5.banco;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;



public class ConexaoBD {

	 private BasicDataSource dataSource;
	    private String usuario = "FERNANDA";
	    private String senha = "FERNANDA";
	    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	    private String driver = "oracle.jdbc.OracleDriver";
	    
	    private static ConexaoBD conexao = new ConexaoBD();
	    
	    private ConexaoBD() {
	    	dataSource = new BasicDataSource();
	    	dataSource.setUsername(usuario);
	    	dataSource.setPassword(senha);
	    	dataSource.setUrl(url);
	    	dataSource.setDriverClassName(driver);
	    }
	    
	    public static ConexaoBD getInstance(){
	    	return conexao;    	
	    }
	    
	    public Connection getConnection() throws SQLException {
	    	return dataSource.getConnection();	
	    }

}
