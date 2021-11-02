package com.sboot.Ecom.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sboot.Ecom.model.Product;
import com.sboot.Ecom.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("/product")
	public List<Product> getAllProducts() {

		 List<Product> product=productService.getAllProducts();

		return product;
	}

	@GetMapping("/product/{Id}")
	public Optional<Product> getProductById(@PathVariable long Id) {

		Optional<Product> product=productService.getProductById(Id);

		return product;
	}

	/*@PostMapping("/product/")
	public void doAddProduct(Product product) {

		productService.add(product);

	}*/

	 @PostMapping("/addP")
	    public String saveProduct(@RequestParam("file") MultipartFile file,
	    		@RequestParam("pname") String name,
	    		@RequestParam("price") String price,
	    		@RequestParam("desc") String desc,
	    		@RequestParam("stock") int stock)
	    {
	    	productService.saveProductToDB(file, name, desc, price,stock);
	    	return "redirect:/customerDetails";
	    }
	 
	@PutMapping("/product")
	public void doEditProduct(Product product) {

		productService.edit(product);

	}
	
	@DeleteMapping("/product/{Id}")
	public void deDeleteProduct(long Id) {
		
		productService.delete(Id);
		
	}
}
