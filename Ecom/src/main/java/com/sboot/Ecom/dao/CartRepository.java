package com.sboot.Ecom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sboot.Ecom.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>{

}
