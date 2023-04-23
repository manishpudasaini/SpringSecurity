package com.SpringSecurity.SpringSecurity.controller;

import com.SpringSecurity.SpringSecurity.entity.User;
import com.SpringSecurity.SpringSecurity.model.UserRequest;
import com.SpringSecurity.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class RegistrationController {

    private final UserService userService;

    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    private ApplicationEventPublisher publisher;



    //to register user in the database
    @PostMapping("/register")
    public String registerUser(@RequestBody UserRequest userRequest){
        User user = userService.registerUser(userRequest);
//        ublisher.publishEvent();
        return "success";
    }

}
