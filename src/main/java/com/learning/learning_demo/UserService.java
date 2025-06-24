package com.learning.learning_demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository  userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getUsers () {
        return userRepository.findAll().stream().toList();
    }

    public void createUser (User newUser) {
         userRepository.save(newUser);

    }
}
