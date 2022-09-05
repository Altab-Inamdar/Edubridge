package org.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Cart {

	@Id
	@GeneratedValue
	private int cartId;
	private int productId;
	private double price;
	private int quantity;
	private String email;
	public void setProductId(Object productId2) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setPrice(Object productPrice) {
		// TODO Auto-generated method stub
		
	}
	public void setQuantity(Object productQuantity) {
		// TODO Auto-generated method stub
		
	}
	public Object getQuantity() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
		
}
