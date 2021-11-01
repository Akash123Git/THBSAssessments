package com.sboot.Ecom.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sboot.Ecom.model.Admin;
import com.sboot.Ecom.model.Customer;
import com.sboot.Ecom.model.Product;
import com.sboot.Ecom.service.AdminService;
import com.sboot.Ecom.service.CustomerService;
import com.sboot.Ecom.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/login")
	public ModelAndView getLoginPage() {
		ModelAndView modelAndView =new ModelAndView("index");
		
		return modelAndView;
	}
	
	@PostMapping("/login")
	public String doLogin(Customer customer) {
		System.out.println("In Post mapping");
		boolean isLogin = customerService.validate(customer);
		System.out.println(isLogin);
		if(isLogin) {
			return "redirect:/dashboard";
		}
		else {
			return "redirect:/login";
		}
	}
	
	@PostMapping("/register")
	public String doregistration(Customer customer) {
		
		System.out.println(customer.getCustEmail()+" <------> "+customer.getCustName());
		customerService.add(customer);
		
		return "redirect:/login";
	}
	

	@GetMapping("/dashboard")
	public ModelAndView getdashboardPage() {
		ModelAndView modelAndView =new ModelAndView("dashboard");
		
		List<Product> allProducts=productService.getAllProducts();
		
		modelAndView.addObject("allProducts",allProducts);
		
		
		return modelAndView;
	}
	
	
	@GetMapping("/addProduct")
	public ModelAndView getAddProductPage() {
		ModelAndView modelAndView =new ModelAndView("addProduct");
		
		return modelAndView;
	}
	
	@GetMapping("/customerDetails")
	public ModelAndView getCustomerDetailsPage() {
		ModelAndView modelAndView =new ModelAndView("customerDetails");
		
		List<Customer> allCustomers=customerService.getAllCustomers();
		
		modelAndView.addObject("allCustomers",allCustomers);
		
		
		return modelAndView;
	}
	
	@PostMapping("/addProducts")
	public String addProducts(Product product) {
		
		productService.add(product);
		
		return "redirect:/dashboard";
	}
}
