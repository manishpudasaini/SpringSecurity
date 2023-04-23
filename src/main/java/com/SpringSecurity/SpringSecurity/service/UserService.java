package com.SpringSecurity.SpringSecurity.service;

import com.SpringSecurity.SpringSecurity.entity.User;
import com.SpringSecurity.SpringSecurity.model.UserRequest;

public interface UserService {

    User registerUser(UserRequest userModel);
}
