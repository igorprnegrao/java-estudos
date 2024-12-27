package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;


public class Program {

	public static void main(String[] args) {
	
		//preparar o banco de dados
		Connection conn =  null;
		//consulta ao banco de dados
		Statement st = null;
		// guardar o resultado do banco de dados 
		ResultSet rs = null;
		try {
			//conectar banco de dados
			conn = DB.getConnection();
			//estanciar um statement
			st = conn.createStatement();
			//rs vai recber a consulta do banco de dados 
			rs = st.executeQuery("select * from department");
			//usar o metodo next para acessar as linhas da coluna da tabela..
			//atraves do loop while enquanto tiver linhas para mostra o loop ira executar
			while (rs.next() ) {
				System.out.println(rs.getInt("Id" ) + ", " + rs.getString("Name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//criei dois metodos para tratar exceptions na classe DB
			DB.closeResultSet(rs);;
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
		
	}

}
