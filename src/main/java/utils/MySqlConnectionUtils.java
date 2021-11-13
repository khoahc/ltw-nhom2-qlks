package utils;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;

public class MySqlConnectionUtils {
		
	public static Connection initializeDatabase() throws SQLException,
		ClassNotFoundException{
		
		String dbDriver = "com.mysql.cj.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306/";
		// Database name to access
		String dbName = "ltw_qlks";
		String dbUserName = "root";
		String dbPassword = "1234";
		String connectionURL = dbURL + dbName;
		Connection conn = null;
		try {
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(connectionURL, dbUserName, dbPassword);
			System.out.print("connect successfully!");
		} catch (Exception ex) {
			System.out.print("connect failure00!");
			ex.printStackTrace();
		}
		return conn; 
	}

	public static void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
	
	public static Date getSQLDate(LocalDate date) {
		return java.sql.Date.valueOf(date);
	}

	public static LocalDate getUtilDate(Date sqlDate) {
		return sqlDate.toLocalDate();
	}
}
