package com.libraryManagementSystem.testers;

import org.hibernate.SessionFactory;
import static com.libraryManagementSystem.utils.LibraryHibernateUtils.getFactory;

public class hibernateConnectionTester {

	public static void main(String[] args) {
		
		try(SessionFactory factory = getFactory()){
			System.out.println("-----------hibernate is running chill bro :D :D :D-------");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
