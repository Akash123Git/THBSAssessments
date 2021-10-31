package com.sboot.Ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.Ecom.model.Customer;
import com.sboot.Ecom.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/customer/{Id}")
	public Customer getCustomerById(@PathVariable long Id){
		
		//Customer customer=customerService.getCustomerById(Id);
		
		return null;//customer;
	}
	
	@PostMapping("/customer")
	public void doAddCustomer(Customer customer) {
		
		//customerService.add(customer);
		
	}
	
	@PutMapping("/customer")
	public void doEditCustomer(Customer customer) {
		//customerService.edit(customer);
	}
	
	@DeleteMapping("/cutomer/{Id}")
	public void doDeleteCustomer(@PathVariable long Id) {
		
		//customerService.delete(Id);
		
	}
}
