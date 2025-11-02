package com.libraryManagementSystem.utils;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class LibraryHibernateUtils {
	
	private static SessionFactory sessionFactory;

	static {
		System.out.println("in static block");
		sessionFactory = new Configuration().configure().buildSessionFactory();
	}
	
	
	public static SessionFactory getFactory() {
		return sessionFactory;
	}
	

}
