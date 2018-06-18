package dw1s5.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dw1s5.banco.ConexaoBD;
import dw1s5.model.Aluno;
import dw1s5.model.Usuario;

public class UsuarioDAO{
	public void salvar(Aluno aluno) throws SQLException{
		String sql = "insert into usuario(cpf, nome, email, senha, IS_ALUNO) values(?,?,?,?,?)";
		ConexaoBD conexao = ConexaoBD.getInstance();

		try(Connection conn = conexao.getConnection();
			PreparedStatement pstat = conn.prepareStatement(sql))
		{
			pstat.setString(1, aluno.getCpf());
			pstat.setString(2, aluno.getNome());
			pstat.setString(3, aluno.getEmail());
			pstat.setString(4, aluno.getSenha());
			if(aluno.getTipo()){
				pstat.setInt(5, 0);
			}
			else{
				pstat.setInt(5, 1);
			}
			

			pstat.executeUpdate();
			System.out.println("Inserção feita com sucesso");
		}
	}

	public List<Usuario> listar() throws SQLException{
		String sql = "select * from usuario";
		ConexaoBD conexao = ConexaoBD.getInstance();

		List<Usuario> usuarios = new ArrayList<>();

		try(Connection conn = conexao.getConnection();
			PreparedStatement pstat = conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery())
		{
			while(rs.next()){
				String cpf = rs.getString("cpf");
				String nome = rs.getString("nome");
				String email = rs.getString("email");
				String senha = rs.getString("senha");
				boolean tipo = rs.getBoolean("tipo");

				usuarios.add(new Usuario(cpf, nome, email, senha, tipo));
			}
		}

		return usuarios;
	}
}