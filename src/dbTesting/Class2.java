package dbTesting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Class2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");

		System.out.println("*driver loaded***");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/arundb", "root", "root");

		System.out.println("*connected successfully***");

		Statement stmt = con.createStatement();

		String s = " insert into tab1 values ( 109 , ' mercury9 ' , 289 , '2020', '10009') ";
		// String s = " update tab1 set UNAME = ' mer 22 ' where userid = 102 " ;
		// String s = " delete users where userid = 102 " ;

		stmt.execute(s);

		con.close();

		System.out.println("* programexecuted**");
	}

}
