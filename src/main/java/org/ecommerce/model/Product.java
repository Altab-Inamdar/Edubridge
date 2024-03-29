package org.ecommerce.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
public class Product implements Serializable {
	
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private String productDescription;
	private double productPrice;
	private int productQuantity;
	@Lob
	private byte[] productImage;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties(value = {"applications", "hibernateLazyInitializer"})
	private Category category;

	public void setProductName(String productName2) {
		// TODO Auto-generated method stub
		
	}

	public void setProductDescription(String productDescription2) {
		// TODO Auto-generated method stub
		
	}

	public void setProductPrice(double productPrice2) {
		// TODO Auto-generated method stub
		
	}

	public void setProductQuantity(int productQuantity2) {
		// TODO Auto-generated method stub
		
	}

	public void setProductImage(byte[] bytes) {
		// TODO Auto-generated method stub
		
	}

	public void setCategory(Category category2) {
		// TODO Auto-generated method stub
		
	}

	public Object getProductId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getProductPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getProductQuantity() {
		// TODO Auto-generated method stub
		return null;
	}

}
