package com.example.service;


import com.example.entity.User;
import com.example.service.fallback.UserClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "service-producer", fallback = UserClientFallback.class)
public interface UserClient {

    @GetMapping(value = "/user/detail/{userId}")
    User getUserById(@PathVariable("userId") Integer userId);


}
