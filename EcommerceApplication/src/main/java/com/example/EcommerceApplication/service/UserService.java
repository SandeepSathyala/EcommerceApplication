package com.example.EcommerceApplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EcommerceApplication.model.User;
import com.example.EcommerceApplication.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(int userId) {
        return userRepository.findById(userId);
    }
    
    public User updateUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }
}
