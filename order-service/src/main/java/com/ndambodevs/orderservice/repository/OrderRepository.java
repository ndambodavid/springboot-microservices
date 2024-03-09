package com.ndambodevs.orderservice.repository;

import com.ndambodevs.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
