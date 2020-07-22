package com.example.service.fallback;

import com.example.entity.User;
import com.example.service.UserClient;
import org.springframework.stereotype.Component;

@Component
public class UserClientFallback implements UserClient {


    @Override
    public User getUserById(Integer userId) {
        User user = new User();
        user.setUserId(userId);
        return user;
    }
}
