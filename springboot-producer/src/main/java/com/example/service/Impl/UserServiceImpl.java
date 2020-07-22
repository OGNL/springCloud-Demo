package com.example.service.Impl;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserServiceImpl implements UserService {


    @Override
    public User getUserById(Integer userId) {
        User user = new User();
        user.setUserId(userId);
        user.setUserName("小明");
        user.setPhone("10086");
        return user;
    }
}
