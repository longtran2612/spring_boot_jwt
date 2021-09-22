package com.example.spring_boot_jwt.service;

import com.example.spring_boot_jwt.authen.UserPrincipal;
import com.example.spring_boot_jwt.entity.User;



public interface UserService {
    User create(User u);
    UserPrincipal findByUserName(String username);
}
