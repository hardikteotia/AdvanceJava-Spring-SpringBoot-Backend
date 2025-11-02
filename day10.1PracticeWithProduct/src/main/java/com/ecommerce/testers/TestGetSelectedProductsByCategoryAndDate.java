package com.ecommerce.testers;

import org.hibernate.SessionFactory;

import com.ecommerce.dao.ProductDAO_Interface;
import com.ecommerce.dao.ProductDAO_Interface_Implementation;
import com.ecommerce.entities.ProductCategory;

import static com.ecommerce.utils.HibernateUtils.getFactory;

import java.time.LocalDate;

public class TestGetSelectedProductsByCategoryAndDate {

	public static void main(String[] args) {
		
		try(SessionFactory sf = getFactory()){
			
			ProductDAO_Interface refObj = new ProductDAO_Interface_Implementation();
			System.out.println("Selected Products - ");
			refObj.getSelectedProductsByCategoryAndDate(LocalDate.parse("2025-02-01"), ProductCategory.CATEGORY_SHOES)
			.forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
