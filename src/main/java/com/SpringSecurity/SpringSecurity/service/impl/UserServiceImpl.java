package com.SpringSecurity.SpringSecurity.service.impl;

import com.SpringSecurity.SpringSecurity.entity.User;
import com.SpringSecurity.SpringSecurity.model.UserRequest;
import com.SpringSecurity.SpringSecurity.repository.UserRepository;
import com.SpringSecurity.SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    private PasswordEncoder passwordEncoder;



    @Override
    public User registerUser(UserRequest userRequest) {

        User user = new User();

        //this is done to change the response(userModel) to entity
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setEmail(userRequest.getEmail());
        user.setPassword(passwordEncoder.encode(userRequest.getPassword()));
        user.setRole("User");

        userRepository.save(user);

        return user;
    }


}
