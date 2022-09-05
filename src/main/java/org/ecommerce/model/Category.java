package org.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
@Entity
public class Category {

	@Id
	@GeneratedValue
	private int categoryId;
	private String categoryName;
	public Object getCategoryId() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setCategoryId(Object categoryId2) {
		// TODO Auto-generated method stub
		
	}
	public MultipartFile getCategoryName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
