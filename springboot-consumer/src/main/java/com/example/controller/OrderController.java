package com.example.controller;

import com.example.entity.User;
import com.example.service.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserClient userClient;


    @GetMapping("/toUser/{userId}")
    public ResponseEntity toUser(@PathVariable("userId") Integer userId){
        User user = userClient.getUserById(userId);
        return ResponseEntity.ok(user);
    }

}
