package com.demo.order_service.service;


import com.demo.order_service.dao.OrderRepository;
import com.demo.order_service.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository Orepo;

    @Override
    public Order createOrder(Order order) {
        Orepo.save(order);
        return order;
    }

    @Override
    public Order getOrder(int id) {
        return Orepo.findById(id).get();
    }
}
