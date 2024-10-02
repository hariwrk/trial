package com.demo.user_service.service;

import com.demo.user_service.dto.OrderDto;
import com.demo.user_service.dto.ResponseDto;
import com.demo.user_service.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<OrderDto> getUser(int userId);
}
