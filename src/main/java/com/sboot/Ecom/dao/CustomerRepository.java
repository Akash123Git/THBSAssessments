package com.sboot.Ecom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sboot.Ecom.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	
}
