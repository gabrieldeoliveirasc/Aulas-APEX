package principal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import bd.Conecxao;

public class Principal {

	public static void main(String[] args) {
		
		Conecxao.abrirConexao();

		// Cadastrar Usu�rios
		/*try {
			String sql = "INSERT INTO usuarios (nome, idade) VALUES (?, ?)";
			
			Conecxao.abrirConexao();
			
			PreparedStatement pstmt = Conecxao.con.prepareStatement(sql);
			pstmt.setString(1, "Camila");
			pstmt.setInt(2, 34);
			
			pstmt.execute();
			
		}catch (Exception erro) {
		System.out.println("Falha ao cadastrar "+erro.getMessage());
		}finally {
			Conecxao.fecharConexao();
		}*/
		
		// Alterar usu�rios
		/*try {
			String sql = "UPDATE usuarios SET nome=?, idade=? WHERE codigo = ?";
			
			Conecxao.abrirConexao();
			
			PreparedStatement pstmt = Conecxao.con.prepareStatement(sql);
			pstmt.setString(1, "J�ssica");
			pstmt.setInt(2, 29);
			pstmt.setInt(3, 1);
			
			pstmt.execute();
			
			System.out.println("Alterado OK");
		}catch (Exception erro) {
		System.out.println("Falha ao alterar "+erro.getMessage());
		}finally {
			Conecxao.fecharConexao();
		}
	}*/
		
		//Excluir usu�rio
		
		/*try {
			String sql = "DELETE FROM usuarios WHERE codigo = ?";
			
			Conecxao.abrirConexao();
			
			PreparedStatement pstmt = Conecxao.con.prepareStatement(sql);
			pstmt.setInt(1, 1);
			
			pstmt.execute();
			
			System.out.println("Removido OK");
		}catch (Exception erro) {
		System.out.println("Falha ao remover "+erro.getMessage());
		}finally {
			Conecxao.fecharConexao();
		}
	}*/
		
		// Selecionar Usu�rios
		/*try {
			String sql = "SELECT * FROM usuarios";
			
			Conecxao.abrirConexao();
			Statement stmt = Conecxao.con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				System.out.println(rs.getNString(2) + " " + rs.getInt(3));
			}
			
		}catch(Exception erro) {
			System.out.println("Falha ao selecionar");
		}finally {
			Conecxao.fecharConexao();
		}*/
	}
}
