package com.ecommerce.testers;

import com.ecommerce.dao.ProductDAO_Interface;
import com.ecommerce.dao.ProductDAO_Interface_Implementation;
import com.ecommerce.entities.Product;
import static com.ecommerce.utils.HibernateUtils.getFactory;
import org.hibernate.SessionFactory;



public class TesterGetProductDetailsById {

	public static void main(String[] args) {
		
		
		try(SessionFactory session = getFactory()){
			ProductDAO_Interface refObj = new ProductDAO_Interface_Implementation();
			
			System.out.println(refObj.getProductDetailsById((long)1));
			System.out.println("-----------------------");
			System.out.println(refObj.getProductDetailsById((long)3));
			System.out.println("-----------------------");
			System.out.println(refObj.getProductDetailsById((long)4));
			System.out.println("-----------------------");
			System.out.println(refObj.getProductDetailsById((long)5));
			System.out.println("-----------------------");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
