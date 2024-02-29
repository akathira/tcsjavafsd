package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class FourJdbc {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Root123$");

		System.out.println("connected to sql");

	    PreparedStatement ps = con.prepareStatement("update emp set sal=sal+? where empno=?");
	    ps.setInt(1,0);
	    ps.setInt(2, 7839);
	    int count = ps.executeUpdate();
	    System.out.println("Records"+count);
	    		
	    		

		

	}

}
