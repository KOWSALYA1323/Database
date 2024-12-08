package databasesql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlDatabase {
	
	static final String url = "jdbc:mysql://localhost:3306/db";

	public static void main(String[] args) throws ClassNotFoundException {
		try {

			Class.forName("com.sql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/SKCOLLEGE", "root", "_______");
			Statement statement = connection.createStatement();

			int result = statement.executeUpdate("INSERT INTO EMPLOYEE VALUES (101, 'Jenny', 25, 10000), (102, 'Jacky', 30, 20000), (103, 'Joe', 20, 40000), (104, 'John', 40, 80000), (105, 'Shameer', 25, 90000);");

			if (result > 0)
				System.out.println("successfully inserted");

			else
				System.out.println("unsucessful insertion");

			connection.close();
		}

		catch (SQLException e) {
			System.out.println(e);
		}
	}

}
