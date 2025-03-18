package com.ecomex.BeYou.repository;

import com.ecomex.BeYou.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
