package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	//biblioteca conection jdbc sl
	private static Connection conn = null;
	//gerar a conecção com o banco de dados
	public static Connection getConnection() {
		try {
			if (conn == null) {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		
		return conn;
	}
	//metodo para fechar a conecção
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
			
		}
	}
	
	//metodo propeties que vai carregar o aquivo e vai tratar a exception caso ocorra 
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
}
