package com.example.spring_boot_jwt.service;

import com.example.spring_boot_jwt.authen.UserPrincipal;
import com.example.spring_boot_jwt.entity.User;
import com.example.spring_boot_jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserImp implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User u) {
        return userRepository.save(u);
    }

    @Override
    public UserPrincipal findByUserName(String username) {
        return null;
    }
}
