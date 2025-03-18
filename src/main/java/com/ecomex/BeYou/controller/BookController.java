package com.ecomex.BeYou.controller;



import com.ecomex.BeYou.entity.Order;
import com.ecomex.BeYou.service.BookService;
import com.ecomex.BeYou.service.CartService;
import com.ecomex.BeYou.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private CartService cartService;
    @Autowired
    private OrderService orderService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "index";
    }

    @PostMapping("/add-to-cart")
    public String addToCart(@RequestParam("bookId") Long bookId) {
        cartService.addToCart(bookId);
        return "redirect:/cart";
    }

    @GetMapping("/cart")
    public String viewCart(Model model) {
        model.addAttribute("cartItems", cartService.getCartItems());
        return "cart";
    }

    @PostMapping("/place-order")
    public String placeOrder(Model model) {
        Order order = orderService.placeOrder();
        model.addAttribute("order", order);
        return "order-confirmation";
    }
}