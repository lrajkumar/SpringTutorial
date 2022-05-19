package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class Product_Dao {
	@Autowired
	Product_Repo prorepo;
	
	public String saveDetails(Product e) {
		prorepo.save(e);
		return "Successfully succed";
	}
	
	public Product getDetails(int id) {
		
	return prorepo.findById(id).get();
}
	public String updateInformation(Product id) {
		prorepo.save(id).getId();
		return "Updated Successfully";
	}
	public String deleteInformation(int id) {
		prorepo.deleteById(id);
		return "Deleted Successfully";
	}
	
   	public List<Product> getList(){
		return prorepo.findAll();
	}
	
     public String saveAll(List<Product> e) {
    	 for(Product i:e) {
 			prorepo.save(i);
 		
 		}
    	 return  "Saved Successfully";
     }
     
     public List<Product> getByPrice(int pri1,int pri2){
    	 return prorepo.getByPrice(pri1,pri2);
      }
      
     
}
	
