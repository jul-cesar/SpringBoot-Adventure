package com.learning.learning_demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUserController(){
        return userService.getUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User newUser) {
        userService.createUser(newUser);
    }
}
