package com.example.EcommerceApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EcommerceApplication.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
