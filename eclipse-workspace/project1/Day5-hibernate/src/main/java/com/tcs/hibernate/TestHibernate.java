package com.tcs.hibernate;

import org.hibernate.cfg.Configuration;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestHibernate {
	public static void main(String[] args) {

		Configuration configure = new Configuration();
		configure = configure.configure(); // read the file from xml and connect with DB
		SessionFactory factory = configure.buildSessionFactory();// then create a session, everything will be build here
		// session will establish a connection to DB
		System.out.println(factory);
		Session session = factory.openSession(); // open a session
		System.out.println(session);
		// before dml begin a transaction
		Transaction transaction = session.beginTransaction();
		
		/*
		// fetch a row from db
		Employee emp = session.get(Employee.class, 1); // 1 is eno
		System.out.println(emp);
		transaction.commit();
		session.close();
		*/
		
		/* This is for saving
		Employee emp = new Employee();
		emp.setEname("Aish");
		emp.setSal(50000);
		session.save(emp);
		transaction.commit();
		session.close();
		*/
		
		/*
		// update query
		Employee emp = session.get(Employee.class, 1);
		emp.setSal(80000);
		session.update(emp);
		transaction.commit();
		session.close();
		*/
		
		//delete query
		Employee emp = session.get(Employee.class, 0);
		session.delete(emp);
		transaction.commit();
		session.close();

	}

}
