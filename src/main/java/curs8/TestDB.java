package curs8;

import java.sql.Connection;

public class TestDB {

	 static String URL = "jdbc:mysql://keytraining-demo.c050jeowbe1q.eu-central-1.rds.amazonaws.com:3306/KeyTraining";
	 static String USER = "demouser";
	 static String PASS = "demouser";
	
	public static void main(String[] args) {

		Connection conn = DbConn.openDbConnection(URL, USER, PASS);
		
		String select = "select * from customers;";
		System.out.println(DbQuery.dbSelectQuery(conn, select));
		String update = "update customers set CustomerName = 'Bogy' where CustomerName ='Nimic'";
		
		DbQuery.dbUpdateQuery(conn, update);
		System.out.println(DbQuery.dbSelectQuery(conn, select));

		DbConn.closeDbConnection(conn);
		
	}

}
