package com.tcs.hibernate;

import org.hibernate.cfg.Configuration;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
		Investors emp = new Investors();
		emp.setName("Aishwarya");
		emp.setAmount(899);
		emp.setAddress("12th main");
		session.save(emp);
		transaction.commit();
		session.close();
		*/
	
		
		Query<Investors> query = session.createQuery("select i from Investors i");
		// Query slash is deprecated that means no longer used.
		List<Investors> result = query.list();
		Iterator<Investors> iter = result.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		session.close();
		
		
	}

}
