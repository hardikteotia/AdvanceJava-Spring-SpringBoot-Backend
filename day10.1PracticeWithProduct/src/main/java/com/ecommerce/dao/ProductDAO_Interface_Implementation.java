package com.ecommerce.dao;

import static com.ecommerce.utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ecommerce.entities.Product;
import com.ecommerce.entities.ProductCategory;


public class ProductDAO_Interface_Implementation implements ProductDAO_Interface{

	@Override
	public String addNewProduct(Product productToAdd) {
		
		//here I got the session from the session factory
		Session session = getFactory().getCurrentSession();
		
		//now i can begin the transaction
		Transaction tx = session.beginTransaction();
		System.out.println("Session is open " + session.isOpen() + " is connected" + session.isConnected());
		
		try {
			session.persist(productToAdd);
			tx.commit();// DML - insert
			System.out.println("Sesison is open " + session.isOpen() + " is connected " + session.isConnected());
		}
		catch(RuntimeException e) {
			//here we are checking tx != null cuz lets suppose the case if somehow it couldn't get the session then transaction wont begin and then tx will have null in it so it will not enter in the if block directly throw the error
			if(tx != null) {
				tx.rollback();
			}
			throw e;
		}
		//if we take the datatype String we can return the message 
		return "Product has been added in the table";
	}

	
	
	@Override
	public Product getProductDetailsById(Long productId) {
		
		Product product = null;
		
		Session session = getFactory().getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		
		try{
			product = session.find(Product.class, productId);
			
			tx.commit();
		}
		catch(RuntimeException e) {
			if(tx != null) {
				tx.rollback();
			}
			throw e;
		}
		
		return product;
	}

	@Override
	public List<Product> getSelectedProductsByCategoryAndDate(LocalDate date, ProductCategory category) {
		
		List<Product> products = null;
		
		String jpql = "select new com.ecommerce.entities.Product(p.productId, p.productName, p.productPrice, p.productCategory) from Product p where p.productManufacturedDate <: manufdate and p.productCategory =: category";
//		String jpql = "select new com.ecommerce.entities.Product(p.productId, p.productName, p.productPrice, p.productCategory) " +
//	              "from Product p " +
//	              "where p.productManufacturedDate < :manufdate " +
//	              "and p.productCategory = :category";

		Session session = getFactory().getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		
		try {
			products = session.createQuery(jpql, Product.class)
					.setParameter("manufdate",date)
					.setParameter("category", category)
					.getResultList();
			tx.commit();
		}
		catch(RuntimeException e) {
			if(tx!=null) {
				tx.rollback();
			}
			throw e;
		}
		
		return products;
	}



	@Override
	public String changeProductPrice(String productName) {
		String statusMessage = "Price Change Failed";
		
		String jpql = "select p from Product p where p.productName = :prodName";
		Product productToUpdate = null;
		
		Session session = getFactory().getCurrentSession();
		
		Transaction tx = session.beginTransaction();
		
		try {
			
			productToUpdate = session.createQuery(jpql, Product.class)
					.setParameter("prodName", productName)
					.getSingleResult();
			System.out.println("product price entered: 10000");
			productToUpdate.setProductPrice(10000);
			tx.commit();
			statusMessage = "Price updation success";
		}
		catch(RuntimeException e) {
			throw e;
		}
		
		
		return statusMessage;
	}

	
	
}
