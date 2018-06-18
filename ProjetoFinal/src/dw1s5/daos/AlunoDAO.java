package dw1s5.daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import dw1s5.banco.ConexaoBD;
import dw1s5.model.Aluno;

public class AlunoDAO{
    public void salvar(Aluno aluno) throws SQLException{
        String sql = "insert into aluno(cpf, datanasc, foto, aprovado) values(?,?,?,?)";
        ConexaoBD conexao = ConexaoBD.getInstance();

        try(Connection conn = conexao.getConnection();
            PreparedStatement pstat = conn.prepareStatement(sql))
        {
        	pstat.setString(1, aluno.getCpf());
            pstat.setDate(2, Date.valueOf(aluno.getDataNasc()));
            //pstat.setByte(2, aluno.getFoto());//??????
            if(aluno.getAprovado()){
            	pstat.setInt(4, 0);
            }
            else{
            	pstat.setInt(4, 1);
            }

            pstat.executeUpdate();
            System.out.println("Inserção feita com sucesso");
        }
    }

	public Aluno recuperaAluno(String login) throws SQLException{
		String sql = "Select u.cpf, u.nome, u.email, u.senha, u.is_aluno, a.datanasc from usuario u join aluno a on(u.cpf = a.cpf) where u.email like ?";
        ConexaoBD conexao = ConexaoBD.getInstance();
        Aluno aluno = null;
        
        try (Connection	 conn	= conexao.getConnection();
        	 PreparedStatement pstat = getPreparedStatement(conn, sql, login);
       		 ResultSet rs = pstat.executeQuery())
        {
           
            while(rs.next()){
            	String cpf = rs.getString(1);
            	String nome = rs.getString(2);
            	String email = rs.getString(3);
            	String senha = rs.getString(4);
            	LocalDate dataNasc = rs.getDate(6).toLocalDate();
            	
    			aluno = new Aluno(cpf, nome, email, senha, dataNasc);
            }
        }
		return aluno;
	}

	private PreparedStatement getPreparedStatement(Connection conn, String sql, String email) throws SQLException {
    	PreparedStatement pStat = conn.prepareStatement(sql);
    	pStat.setString(1, '%' + email + '%');
    	return pStat;
    }
}