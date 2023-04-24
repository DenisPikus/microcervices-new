package com.dpikus.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpikus.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
