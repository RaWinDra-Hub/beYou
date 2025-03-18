package com.ecomex.BeYou.repository;

import com.ecomex.BeYou.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
