package com.cart.project;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cart.repository.CartRepository;
import com.cart.entity.Cart;

import com.cart.service.CartService;

@SpringBootTest
class CartServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	@MockBean
	private CartRepository cartRepository;
		@Autowired
	private CartService cartService;
		
	@Test
		public void getAllTest() {
			when(cartRepository.findAll()).thenReturn(Stream.of(new Cart(1,"screw",2,"Other",500),
					new Cart(1,"screw",2,"Other",500)).collect(Collectors.toList()));
			assertEquals(2, cartService.findallCart().size());
		}
	
	
	
	@Test
	public void deleteTest() {
		Cart cart = new Cart(1,"screw",2,"Other",500);
		cartService.deleteCart(1);
		verify(cartRepository,times(1)).deleteById(1);
	}

}
