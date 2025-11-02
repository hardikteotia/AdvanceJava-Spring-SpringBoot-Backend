package com.ecommerce.entities;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "products_table")
public class Product {
	/*
	 *product id : Long (auto increment)
	 *name : string (unique) : varchar(50)
	 *product description : string : varchar(300)
	 *manufacture date : LocalDate
	 *price : double
	 *available quantity : int 
	 */
	@Id //Primary Key will be our Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long productId;
	
	@Column(name= "t_product_name", length = 30)
	private String productName;
	
	@Column(name = "t_product_description", length = 300)
	private String productDescription;
	
	//	@Column(name = "t_product_manufactured_date")
	//here we dont need to map it explicitly hibernate will do it itself
	private LocalDate productManufacturedDate;
	
	@Column(name = "t_product_price")
	private double productPrice;
	
	@Column(name = "t_product_available_qty")
	private int productAvailableQuantity;
	
	@Enumerated(EnumType.STRING)
	private ProductCategory productCategory;
	
	//constructor for Product 
	public Product(String productName, String productDescription, LocalDate productManufacturedDate,
			double productPrice, int productAvailableQuantity, ProductCategory productCategory) {
		
		this.productName = productName;
		this.productDescription = productDescription;
		this.productManufacturedDate = productManufacturedDate;
		this.productPrice = productPrice;
		this.productAvailableQuantity = productAvailableQuantity;
		this.productCategory = productCategory;
	}
	
	
	
	public Product() {
		
	}

	

	public Product(Long productId, String productName, double productPrice, ProductCategory productCategory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}



	//getters and setters for fields
	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public LocalDate getProductManufacturedDate() {
		return productManufacturedDate;
	}

	public void setProductManufacturedDate(LocalDate productManufacturedDate) {
		this.productManufacturedDate = productManufacturedDate;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductAvailableQuantity() {
		return productAvailableQuantity;
	}

	public void setProductAvailableQuantity(int productAvailableQuantity) {
		this.productAvailableQuantity = productAvailableQuantity;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}


	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	
	//to string method
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDescription="
				+ productDescription + ", productManufacturedDate=" + productManufacturedDate + ", productPrice="
				+ productPrice + ", productAvailableQuantity=" + productAvailableQuantity + "]";
	}
	
	
	
	
	
	
	
	
}
