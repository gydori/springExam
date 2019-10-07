package hu.flowacademy.test.foodorder.controller;

import hu.flowacademy.test.foodorder.model.Cart;
import hu.flowacademy.test.foodorder.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CartController {
    @Autowired
    CartService cartService;

    public Cart createCart(Cart cart){
        return cartService.createCart(cart);
    }

    public Cart findOneCart(Long id) {
        return cartService.findOneCart(id);
    }

    public List<Cart> findAllCart() {
        return cartService.findAllCart();
    }

    public void deleteCart(Cart cart){
        cartService.deleteCart(cart);
    }

    /*public Cart updateCart(Cart cart){
        return cartService.updateCart(cart);
    }*/
}
