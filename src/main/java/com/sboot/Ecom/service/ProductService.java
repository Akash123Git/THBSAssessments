package com.sboot.Ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.Ecom.dao.ProductRepository;
import com.sboot.Ecom.model.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public Optional<Product> getProductById(long id) {
		Optional<Product> product=productRepository.findById(id);
		return product;
	}


	public List<Product> getAllProducts() {
		List<Product> product = productRepository.findAll();
		return product;
	}


	public void add(Product product) {
		productRepository.save(product);
		
	}


	public void edit(Product product) {
		productRepository.save(product);
		
	}


	public void delete(long id) {
		productRepository.deleteById(id);
		
	}

	
}
