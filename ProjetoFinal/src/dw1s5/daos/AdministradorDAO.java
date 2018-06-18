package dw1s5.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dw1s5.banco.ConexaoBD;
import dw1s5.model.Administrador;

public class AdministradorDAO{
	public Administrador recuperaAdministrador(String login) throws SQLException{
		String sql = "Select cpf, nome, email, senha from usuario where u.email like ?";
        ConexaoBD conexao = ConexaoBD.getInstance();
        Administrador administrador = null;
        
        try (Connection	 conn	= conexao.getConnection();
        	 PreparedStatement pstat = getPreparedStatement(conn, sql, login);
       		 ResultSet rs = pstat.executeQuery())
        {
           
            while(rs.next()){
            	String cpf = rs.getString(1);
            	String nome = rs.getString(2);
            	String email = rs.getString(3);
            	String senha = rs.getString(4);
            	boolean tipo = rs.getBoolean(5);
            	
    			administrador = new Administrador(cpf, nome, email, senha, tipo);
            }
        }
		return administrador;
	}

	private PreparedStatement getPreparedStatement(Connection conn, String sql, String email) throws SQLException {
    	PreparedStatement pStat = conn.prepareStatement(sql);
    	pStat.setString(1, '%' + email + '%');
    	return pStat;
    }
}