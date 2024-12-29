package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbException;

public class Program {

	public static void main(String[] args) {

		Connection cnn = null;
		Statement st = null;

		try {
			cnn = DB.getConnection();

			cnn.setAutoCommit(false);

			st = cnn.createStatement();

			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			//int x = 1;
			//if (x < 2) {
			//	throw new SQLException("Fake error");
			//}
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

			cnn.commit();

			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);

		} catch (Exception e) {
			try {
				cnn.rollback();
				throw new DbException("transaction rolled back! caused by: " + e.getMessage());
			} catch (SQLException e1) {

				throw new DbException("error trying to roolback! caused by: " + e1.getMessage());
			}
		} finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
