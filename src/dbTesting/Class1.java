package dbTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Class1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("*driver loaded***");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arundb", "root", "root");

		System.out.println("*connected successfully***");

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery("select * from tab1");

		while (rs.next()) {

			String id = rs.getString("id");
			System.out.println("id is :" + id);

			String name = rs.getString("name");
			System.out.println("name is :" + name);

			String age = rs.getString("age");
			System.out.println("age is :" + age);

			String year = rs.getString("year");
			System.out.println("year is :" + year);

			String phoneNumber = rs.getString("phone");
			System.out.println("phone number is :" + phoneNumber);

	}
	}
}
