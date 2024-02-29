package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ThirdJdbc {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Root123$");

		System.out.println("connected to sql");

		Statement st = con.createStatement();

		String update = "update EMP set sal = sal+0 where deptno in (10,20,30)";
		int count = st.executeUpdate(update);

		String sql = "select*from EMP where empno=1012";
		ResultSet rs = st.executeQuery(sql);
		ResultSetMetaData rscl = rs.getMetaData();

		System.out.println(rscl.getColumnCount());
		System.out.println(rscl.getColumnName(1));
		System.out.println(rscl.getColumnName(2));
		System.out.println(rscl.getColumnName(3));

		System.out.println(count);

	}

}
