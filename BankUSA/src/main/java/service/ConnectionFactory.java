package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	

	/*
	 * JDBC - Java Database Connection
	 * 
	 * JDBC API handles databases using Java, allows us to interact with our database through CRUD methods
	 * 
	 * Important interfaces in JDBC
	 * 
	 * DriverManager
	 * Connection
	 * Statement
	 * PreparedStatement
	 */
	
	/*
	 * What do we need to connect?
	 * 
	 * We need Endpoint, username and password
	 */
	
		// "jdbc:postgresql://[ENDPOINT]/[DATABASE]
	private static final String URL = "jdbc:postgresql://isilo.db.elephantsql.com:5432/cfultkud";
	private static final String USERNAME = "cfultkud" ;
	private static final String PASSWORD = "D_8Yzn_xf0ML8DblaULbAN2sxVMRkVxM";
	
	private static Connection conn;
	
	public static Connection getConnection() {
		
		
		try {
			if (conn == null || conn.isClosed()) {
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			}
			
			return conn;
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	

		
		/*try {
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}*/


}
