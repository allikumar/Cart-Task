package com.cart.service;

import java.util.List;

import com.cart.entity.Cart;


public interface CartService {

public String addCart(Cart cart);
public List<Cart> findallCart();
public Cart findCart(int id);
public String deleteCart(int id);
public String updateCart(int id,Cart cart);
}
