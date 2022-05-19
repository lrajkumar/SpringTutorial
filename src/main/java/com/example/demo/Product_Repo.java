package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

public interface Product_Repo extends JpaRepository<Product,Integer> {

	@Query(value="select*from product_info where price >=:pri1 AND price <=:pri2", nativeQuery=true)
	public List<Product> getByPrice(@PathVariable ("pri1") int pri1, @PathVariable("pri2") int pri2);
	
}
