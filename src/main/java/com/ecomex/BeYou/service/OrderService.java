package com.ecomex.BeYou.service;



import com.ecomex.BeYou.entity.Cart;
import com.ecomex.BeYou.entity.Order;
import com.ecomex.BeYou.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private CartService cartService;

    public Order placeOrder() {
        List<Cart> cartItems = cartService.getCartItems();
        double total = cartItems.stream().mapToDouble(item -> item.getBook().getPrice() * item.getQuantity()).sum();

        Order order = new Order();
        order.setItems(cartItems);
        order.setTotal(total);
        return orderRepository.save(order);
    }
}