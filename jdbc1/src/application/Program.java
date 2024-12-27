package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		// método gerar com  getConnection da classe DB
		Connection conn =  DB.getConnection();
		// metodo fechar conexão 
		DB.closeConnection();
		
	}

}
