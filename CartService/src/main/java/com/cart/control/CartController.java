package com.cart.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cart.entity.Cart;
import com.cart.service.CartService;
@RestController
@RequestMapping("/product")

public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/add")
	public String addCart(@RequestBody Cart cart) {
		return cartService.addCart(cart) ;
		
	}
	
	@GetMapping("/findall")
	public List<Cart> findAllCart(){
		return cartService.findallCart();
	}
	
	@GetMapping("/find/{id}")
	public Cart findCart(@PathVariable int id) {
		return cartService.findCart(id);
	}
	
	@PutMapping("/update/{id}")
	public String updateCart(@PathVariable int id, @RequestBody Cart cart) {
		return cartService.updateCart(id, cart);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCart(@PathVariable int id) {
		return cartService.deleteCart(id);
	}


	
	
}