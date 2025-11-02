package com.ecommerce.testers;

import static com.ecommerce.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.ecommerce.dao.ProductDAO_Interface;
import com.ecommerce.dao.ProductDAO_Interface_Implementation;
import com.ecommerce.entities.Product;
import com.ecommerce.entities.ProductCategory;

public class TestAddNewProduct {
	public static void main(String [] args) {
		
		try(Scanner sc = new Scanner(System.in);
				SessionFactory sf = getFactory()){
			
			ProductDAO_Interface productDAO_InterfaceObj = new ProductDAO_Interface_Implementation();
			
			Product productSenderObject = new Product("Gel Pen Set",
				    "Pack of 10 smooth-writing blue gel pens",
				    LocalDate.parse("2025-03-10"),
				    199.99,
				    250,
				    ProductCategory.CATEGORY_STATIONARY);
			
			Product p2 = new Product(
				    "Running Shoes",
				    "Lightweight breathable running shoes for men",
				    LocalDate.of(2024, 11, 5),
				    2499.00,
				    75,
				    ProductCategory.CATEGORY_SHOES
				);
			
			Product p3 = new Product(
				    "Basmati Rice 5kg",
				    "Premium long-grain basmati rice, aged for 1 year",
				    LocalDate.of(2025, 1, 20),
				    649.50,
				    120,
				    ProductCategory.CATEGORY_GRAINS
				);
			
			Product p4 = new Product(
				    "Sunflower Oil 1L",
				    "Refined sunflower cooking oil - 1L bottle",
				    LocalDate.of(2025, 2, 8),
				    189.00,
				    300,
				    ProductCategory.CATEGORY_OIL
				);
			
			System.out.println("Registration Status:- " + productDAO_InterfaceObj.addNewProduct(productSenderObject));
			System.out.println("Registration Status:- " + productDAO_InterfaceObj.addNewProduct(p2));
			System.out.println("Registration Status:- " + productDAO_InterfaceObj.addNewProduct(p3));
			System.out.println("Registration Status:- " + productDAO_InterfaceObj.addNewProduct(p4));
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
