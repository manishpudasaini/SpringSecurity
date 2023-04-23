package com.SpringSecurity.SpringSecurity.service.impl;

import com.SpringSecurity.SpringSecurity.entity.User;
import com.SpringSecurity.SpringSecurity.model.UserModel;
import com.SpringSecurity.SpringSecurity.repository.UserRepository;
import com.SpringSecurity.SpringSecurity.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(UserModel userModel) {

        User user = new User();
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setEmail(userModel.getEmail());
        user.setPassword(userModel.getPassword());
        user.setRole("User");

        return null;
    }


}
