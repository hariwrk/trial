package com.demo.order_service.controller;

import com.demo.order_service.entity.Order;
import com.demo.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class OrderController {
    @Autowired
    OrderService service;

    @PostMapping("/create")
    public Order create(@RequestBody Order order){
        return service.createOrder(order);
    }

    @GetMapping("/get/{id}")
    public Order get(@RequestBody int id){
        return service.getOrder(id);
    }
}
