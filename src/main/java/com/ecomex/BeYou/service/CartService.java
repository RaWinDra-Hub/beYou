package com.ecomex.BeYou.service;

import com.ecomex.BeYou.entity.Book;
import com.ecomex.BeYou.entity.Cart;
import com.ecomex.BeYou.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private BookService bookService;

    public void addToCart(Long bookId) {
        Book book = bookService.getBookById(bookId);
        Cart cart = new Cart();
        cart.setBook(book);
        cart.setQuantity(1);
        cartRepository.save(cart);

    }
    public List<Cart> getCartItems(){
        return cartRepository.findAll();
    }






}
