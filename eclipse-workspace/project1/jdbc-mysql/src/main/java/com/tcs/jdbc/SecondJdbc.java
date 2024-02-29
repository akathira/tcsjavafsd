package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SecondJdbc {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Root123$");

		System.out.println("connected to sql");

		Statement st = con.createStatement();
		String sql = "insert into EMP values(1015,'abc','MANAGER', 7839,'199-01-01',2300,null,10)";
		int count = st.executeUpdate(sql);

		System.out.println("Record executed" + count);

		sql = "select*from EMP where empno=1012";
		ResultSet rs = st.executeQuery(sql);

		while (rs.next()) {
			System.out.println(rs.getString(1) +

					"|" + rs.getString(2) + "|" + rs.getString(3) + "|" + rs.getString(4));
		}

	}

}
