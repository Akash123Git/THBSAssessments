package com.sboot.Ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.Ecom.dao.CustomerRepository;
import com.sboot.Ecom.model.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public Optional<Customer> getCustomerById(long Id) {
		Optional<Customer> customer=customerRepository.findById(Id);
		return customer;
	}
	
	public List<Customer> getAllCustomers() {
		List<Customer> customer=customerRepository.findAll();
		return customer;
	}


	public void add(Customer customer) {
		customerRepository.save(customer);
	}

	public void edit(Customer customer) {
		customerRepository.save(customer);
	}

	public void delete(long id) {
		customerRepository.deleteById(id);
	}

	public boolean validate(Customer customer) {

		String email = customer.getCustEmail();
		String password = customer.getCustPassword();

		for (Customer customer1 : customerRepository.findAll()) {
			
			if (customer1.getCustEmail().equals(email) && customer1.getCustPassword().equals(password)) {
				return true;
			}
		}

		return false;
	}
}
