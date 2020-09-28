package bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conecxao {
	
	/*
	 C�digo MSQL
	 
	  CREATE DATABASE java_banco;

USE java_banco;

CREATE TABLE usuarios(
codigo INT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(30),
idade int
);
SELECT * FROM USUARIOS;
	  
	 
	 */
	
	
	
	// Atributo contendo o acesso ao bd
	public static Connection con;
	
	// Abrir a conex�o
	public static void abrirConexao() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/java_banco", "root", "apex");
			
			
			
			System.out.println("Conex�o OK");
		}catch(Exception erro) {
			System.out.println("Falha ao conectar");
		}
	}
	
	// Fechar a conex�o
	public static void fecharConexao() {
		try {
			con.close();
		}catch(Exception erro) {}
	}

}
