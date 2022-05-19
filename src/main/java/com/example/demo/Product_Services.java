package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Product_Services {
	@Autowired
	Product_Dao productdao;
	
	public String saveDetails(Product product) {
		
		validatePrice(product);
		
		return productdao.saveDetails(product);
	}
	
	private void validatePrice(Product product) {
		
		if(product.getPrice() > 50000) {
			throw new IllegalArgumentException("Price cannot be more than 50k");
		}
		
	}

	public Product getDetails(int id) {
		return productdao.getDetails(id);
	}

	public String updateInformation(Product id) {
		return productdao.updateInformation(id);
	}
	
	public String deleteInformation(int id) {
		return productdao.deleteInformation(id);
	}
	
	public List<Product> getList(){
		return productdao.getList();
	}
	
	public String saveAll(List<Product> e) {
		return productdao.saveAll(e);
	}
	
	public List<Product> getByPrice(int pri1,int pri2){
		return productdao.getByPrice(pri1,pri2);
	}
}


