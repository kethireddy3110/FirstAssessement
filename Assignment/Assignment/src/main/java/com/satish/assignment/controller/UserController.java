package com.satish.assignment.controller;

import com.satish.assignment.model.User;
import com.satish.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
    	Optional<User> userById = userService.getUserById(id);
    	if(userById.isPresent()) {
    		return userById.get();
    	}
    	else {
    		return null;
    	}
    }
    
    @PostMapping("/users")
    public void createUser(@RequestBody User user){
    	userService.createUser(user);
    }
    
    @DeleteMapping("/users/{id}")
    public void deleteById(@PathVariable Long id) {
    	userService.deleteById(id);
    }
    
    @DeleteMapping("/users")
    public void deleteAll() {
    	userService.deleteAll();
    }
}
