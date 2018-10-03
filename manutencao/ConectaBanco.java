package manutencao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectaBanco {
	
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/bdmanutencao";
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	
	public static Connection criaConexao() throws Exception {
		Class.forName(DRIVER);
		
		Connection conexao = DriverManager.getConnection(URL,
				USUARIO, SENHA);
		
		return conexao;
	}
	
	public static void main (String args[]) throws Exception {
		
		Connection conn = criaConexao();
		
		if (conn != null){
			System.out.println("Conexão realizada com sucesso" + conn);
			conn.close();
		}
	}

}
