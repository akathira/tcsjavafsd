package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbc {

	public static void main(String[] args) throws SQLException {
		//1. Establish connection = 3 -> url, username, pwd of database
		// url= "jdbc:mysql://localhost:3306:schemaname/dbname"
		//2. obtain statement reference
		//3. prepare SQL statements
		//4. Execute statements
		//5. Process and fetch result set
		//6. close connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","Root123$");
		//Driver Manager try to connect with the URL
		//jdbc - main protocol, mysql/oracle - subprotocol
		//need to specify the url, then give schema/db name. then username & password.
		//getConnection(String url, properties info) -> Real time we can use this
		//Those properties will be used for security purposes.
		// before java 8 -> we will load the driver class.forName("mysql.jdbc.MysqlDriver")
		//Static method are know as factory method, the details of the obj creation is hidden
		//Got the connection
		
		System.out.println("connected to sql");
		
		  Statement st = con.createStatement(); //It's like a tunnel using this we can create sql statement as a string
		  String sql = "select * from EMP";
		  ResultSet rs = st.executeQuery(sql); // It's used to perform operation in db
		  // Resultset is fetch from db & store it in resultSet it's like a datastructure or cache
		  //if rs.next it enter into the first column, then go to next. 
		  while(rs.next()) // -> row is there it will return true, otherwise false 
	     { 
			  System.out.println(rs.getString(1) +  // we can give string or rs.getInt(1) -> for computation give proper datatype
					  "|" + rs.getString(2) + 
					  "|" + rs.getString(3)+ 
					  "|"+rs.getString(4)) ;//-> printing 4 columns from table }
		} 


	}

}

//org.hibernate.dialect.MySQLDialect
