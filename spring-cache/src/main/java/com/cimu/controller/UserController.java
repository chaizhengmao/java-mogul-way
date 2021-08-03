package com.cimu.controller;

import com.alibaba.fastjson.JSONObject;
import com.cimu.entity.User;
import com.cimu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: zhengmao_chai
 * @date: 2021/6/27 12:10
 * @since: 1.0.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Object getUsers() {
        List<User> users = userService.listUsers();
        return JSONObject.toJSON(users);
    }
}