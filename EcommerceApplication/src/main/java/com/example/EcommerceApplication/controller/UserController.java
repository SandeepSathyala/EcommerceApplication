package com.example.EcommerceApplication.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EcommerceApplication.dto.UserDto;
import com.example.EcommerceApplication.model.User;
import com.example.EcommerceApplication.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto user) {
        User createdUser = userService.createUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }
    

    @GetMapping
    public ResponseEntity<Object> getAllUsers() {
        List<User> users = userService.getAllUsers();
        if (users.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No users found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

//    @GetMapping("/{userId}")
//    public ResponseEntity<Object> getUserById(@PathVariable int userId) {
//        Optional<User> user = userService.getUserById(userId);
//        return user.map(value -> ResponseEntity.status(HttpStatus.OK).body(value))
//                   .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found"));
//    }


    @PutMapping("/{userId}")
    public ResponseEntity<Object> updateUser(@PathVariable int userId, @RequestBody User user) {
        user.setUser_id(userId); // Ensure userId is set correctly
        User updatedUser = userService.updateUser(user);
        return ResponseEntity.status(HttpStatus.OK).body(updatedUser);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Object> deleteUser(@PathVariable int userId) {
        userService.deleteUser(userId);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}