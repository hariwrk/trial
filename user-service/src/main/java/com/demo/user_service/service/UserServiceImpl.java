package com.demo.user_service.service;

import com.demo.user_service.dao.UserRepository;
import com.demo.user_service.dto.OrderDto;
import com.demo.user_service.dto.ResponseDto;
import com.demo.user_service.dto.UserDto;
import com.demo.user_service.entity.User;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

import java.util.List;

public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository urepo;

    @Override
    public User saveUser(User user) {
        return  urepo.save(user);
    }

    @Override
    public List<OrderDto> getUser(int userId) {
        RestClient restClient = RestClient.create();
        List<OrderDto> allOrders = restClient
                .get()
                .uri("http://localhost:8081/api/orders/user/"+userId)
                .retrieve()
                .body(List.class);
        return allOrders;
    }

    private UserDto mapToUser(User user){
        UserDto userDto = new UserDto();
        userDto.setUserId(user.getUserId());
        userDto.setName((user.getName()));
        return userDto;
    }
}
