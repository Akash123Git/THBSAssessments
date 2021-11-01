package com.sboot.Ecom.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.Ecom.dao.CartRepository;
import com.sboot.Ecom.model.Cart;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;
	
	public List<Cart> getAllCartItems() {
		
		List<Cart> cartItems=cartRepository.findAll();
		
		return cartItems;
	}

	public Optional<Cart> getCartItemsById(long id) {
		Optional<Cart> cartItems=cartRepository.findById(id);
		return cartItems;
	}

	public void add(Cart cart) {
		cartRepository.save(cart);
		
	}

	public void delete(long id) {
		cartRepository.deleteById(id);
		
	}

}
