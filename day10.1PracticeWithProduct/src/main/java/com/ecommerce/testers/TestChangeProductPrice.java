package com.ecommerce.testers;

import java.time.LocalDate;

import org.hibernate.SessionFactory;

import com.ecommerce.dao.ProductDAO_Interface;
import com.ecommerce.dao.ProductDAO_Interface_Implementation;
import static com.ecommerce.utils.HibernateUtils.getFactory;

public class TestChangeProductPrice {

public static void main(String[] args) {
		
		try(SessionFactory sf = getFactory()){
			
			ProductDAO_Interface refObj = new ProductDAO_Interface_Implementation();
			System.out.println(refObj.changeProductPrice("Basmati Rice 5kg"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
