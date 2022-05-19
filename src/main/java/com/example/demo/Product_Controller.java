package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product_Controller {
	@Autowired
	Product_Services productser;

	@PostMapping(value = "/add")
	public String saveDetails(@RequestBody Product e) {
		return productser.saveDetails(e);
	}

	@GetMapping(value = "/show/{id}")
	public Product getDetails(@PathVariable int id) {
		return productser.getDetails(id);
	}

	@PutMapping(value = "/update/{id}")
	public String updateInformation(@PathVariable Product id) {
		return productser.updateInformation(id);
	}

	@DeleteMapping(value = "/delete/{id}")
	public String deleteInformation(@PathVariable int id) {
		return productser.deleteInformation(id);
	}

	@GetMapping(value = "/display")
	public List<Product> getList() {
		return productser.getList();
	}

	@PostMapping(value = "/saveAll")
	public String saveAll(@RequestBody List<Product> e) {
		return productser.saveAll(e);
	}

	@GetMapping(value = "/getviaprice/{pri1}/{pri2}")
	public List<Product> getByPrice(@PathVariable int pri1, @PathVariable int pri2) {
		return productser.getByPrice(pri1, pri2);
	}

}
