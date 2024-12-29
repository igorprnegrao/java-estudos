package application;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db.DB;
import db.DbIntegretyException;

public class Program {

	public static void main(String[] args) {
		
		Connection cnn = null;
		PreparedStatement st = null;
		
		try {
			cnn = DB.getConnection();
			st = cnn.prepareStatement(
					"DELETE FROM seller "
					+ "WHERE "
					+ "Id = ?");
			
			st.setInt(1, 7);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: "+ rowsAffected);
		} catch (Exception e) {
			throw new DbIntegretyException(e.getMessage());
			} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
