package com.demo.order_service.service;

import com.demo.order_service.entity.Order;

public interface OrderService {
    Order createOrder(Order order);
    Order getOrder(int id);
}
