package com.example.springmvc.service;

import org.springframework.stereotype.Service;

import com.example.springmvc.domain.User;
import com.example.springmvc.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User handleSaveUser(User user){
        return userRepository.save(user);
    }

    public String handleHello(){
        return "Hello from  service";
    }
}
