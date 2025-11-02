package com.ecommerce.testers;

import static com.ecommerce.utils.HibernateUtils.getFactory;

import org.hibernate.*;

public class TestHibernate {

	public static void main(String[] args) {
		try (SessionFactory factory = getFactory()) {
			System.out.println("hibernate up n running , SF "+factory);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
