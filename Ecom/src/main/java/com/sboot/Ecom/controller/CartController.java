package com.sboot.Ecom.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.Ecom.model.Cart;
import com.sboot.Ecom.service.CartService;

@RestController
@RequestMapping("/api")
public class CartController {

	@Autowired
	private CartService cartService;

	@GetMapping("/cart/{Id}")
	public Optional<Cart> getCartItemsById(@PathVariable long Id) {
		
		Optional<Cart> cart= cartService.getCartItemsById(Id);
		
		return cart;
	}

	@PostMapping("/cart")
	public void doAddToCart(Cart cart) {
		cartService.add(cart);
	}
	
	@DeleteMapping("/cart/{Id}")
	public void doDeleteCartItem(@PathVariable long Id) {
		cartService.delete(Id);
	}
}
