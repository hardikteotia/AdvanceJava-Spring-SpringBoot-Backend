package com.ecommerce.dao;

import java.time.LocalDate;
import java.util.List;

import com.ecommerce.entities.Product;
import com.ecommerce.entities.ProductCategory;

public interface ProductDAO_Interface {
	
	
/*1. Add a new product
i/p - product details (except id)
o/p - message (success or failure)*/
	
	String addNewProduct(Product productToAdd);
	
/* 2. Display product details 
i/p - product id 
o/p - product details OR error message*/
	
	Product getProductDetailsById(Long productId);
	
/*3. Display   id , name , price  of all the products manufactured before specified date and
 * from specific category
i/p - date , category(enum)
o/p - List of selected products details*/
	
	List<Product> getSelectedProductsByCategoryAndDate(LocalDate date, ProductCategory category);
	
/* 4. Change Product price
 i/p - product name
 o/p - message*/
	
	String changeProductPrice(String productName);
}
