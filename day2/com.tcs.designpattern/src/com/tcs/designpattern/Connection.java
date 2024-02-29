package com.tcs.designpattern;

public class Connection {

	private static Connection con = null;

	private Connection() { // prevention of object creation

	}

	public static Connection getConnection() {
		if (con == null)
			con = new Connection();
			return con;
	}
}
