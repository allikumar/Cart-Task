package com.cart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cart.entity.Cart;
import com.cart.repository.CartRepository;


@Service
public class CartServiceImpl implements CartService {
@Autowired
private CartRepository cartRepository;

	@Override
	public String addCart(Cart cart) {
		cartRepository.save(cart);
		return "Product added Successfully with id"+ cart.getId() ;
	}

	@Override
	public List<Cart> findallCart() {
		return cartRepository.findAll();
		
	}

	@Override
	public Cart findCart(int id) {
	return cartRepository.findById(id).get();
		
	}
	  @Override
	    public String deleteCart(int id)  {
	        cartRepository.deleteById(id);
	        return "Product Deleted Successfuly with id"+id;
	    }


	@Override
	public String updateCart(int id, Cart cart) {
		Optional<Cart> Container = cartRepository.findById(id);
		if(Container.isPresent()) {
			Cart n=Container.get();
			n.setId(cart.getId());
			n.setProduct_name(cart.getProduct_name());
			n.setQuantity(cart.getQuantity());
			n.setDescription(cart.getDescription());
			n.setPrice(cart.getPrice());
			cartRepository.save(n);
			return "Product updated succesfully with id"+ id;
		}
		else {
			return "Id not found";
		}
		
	}

}
