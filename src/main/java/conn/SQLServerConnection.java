package conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerConnection {
	public static Connection initializeDatabase()
			throws SQLException, ClassNotFoundException{
		String dbDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL = "jdbc:sqlserver://localhost:1433";
		// Database name to access
		String dbName = "DBMS_NoiThat";
		String dbUserName = "sa";
		String dbPassword = "1234";
		String connectionURL = dbURL + ";databaseName=" + dbName;
		Connection conn = null;
		try {
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(connectionURL, dbUserName, dbPassword);
			System.out.print("connect successfully!");
		} catch (Exception ex) {
			System.out.print("connect failure!");
			ex.printStackTrace();
		}
		
		return conn;
	}
}
