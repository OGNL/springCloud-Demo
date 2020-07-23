package com.example.controller;

import com.example.entity.User;
import com.example.service.UserClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Api(tags = "用户模块")
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserClient userClient;

    @ApiOperation(value = "获取某个用户详细信息", notes = "通过id查询用户")
    @ApiImplicitParam(name = "userId", value = "用户的唯一标识", required = true, dataType = "int")
    @GetMapping("/toUser/{userId}")
    public ResponseEntity toUser(@PathVariable("userId") Integer userId){
        User user = userClient.getUserById(userId);
        return ResponseEntity.ok(user);
    }

}
