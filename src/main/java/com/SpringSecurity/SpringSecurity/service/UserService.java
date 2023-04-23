package com.SpringSecurity.SpringSecurity.service;

import com.SpringSecurity.SpringSecurity.entity.User;
import com.SpringSecurity.SpringSecurity.model.UserModel;

public interface UserService {

    User registerUser(UserModel userModel);
}
