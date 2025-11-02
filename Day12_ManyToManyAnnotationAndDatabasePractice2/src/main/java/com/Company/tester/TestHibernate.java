package com.Company.tester;

import static com.Company.utils.HibernateUtils.getFactory;

import org.hibernate.SessionFactory;

//import com.School.entities.User;

public class TestHibernate {

	public static void main(String[] args) {
		try (SessionFactory factory = getFactory()) {
			System.out.println("hibernate up n running , SF "+factory);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
