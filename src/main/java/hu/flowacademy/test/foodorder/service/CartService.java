package hu.flowacademy.test.foodorder.service;

import hu.flowacademy.test.foodorder.model.Cart;
import hu.flowacademy.test.foodorder.model.User;
import hu.flowacademy.test.foodorder.model.ValidationException;
import hu.flowacademy.test.foodorder.repository.CartRepository;
import hu.flowacademy.test.foodorder.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CartService {

    @Autowired
    CartRepository cartRepository;

    public Cart createCart(Cart cart) {
        if (cart.getUser() == null || cart.getFoods() == null) {
            throw new ValidationException("missing data");
        }else {
            cart.setOrderDate(LocalDateTime.now());
            cartRepository.save(cart);
            return cart;
        }
    }

    public Cart findOneCart(Long id) {
        return cartRepository.findByCartId(id);
    }

    public List<Cart> findAllCart() {
        return cartRepository.findAll();
    }

    public void deleteCart(Cart cart) {
        cartRepository.delete(cart);
    }

    public Cart updateCart(Cart cart) {
        if (cart.getUser() == null || cart.getFoods() == null) {
            throw new ValidationException("missing data");
        }else {
            Cart modify = cartRepository.findByCartId(cart.getId());
            modify.setFoods(cart.getFoods());
            modify.setOrderDate(cart.getOrderDate());
            modify.setUser(cart.getUser());
            return modify;
        }
    }
}
