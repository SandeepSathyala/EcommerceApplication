package com.example.EcommerceApplication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.EcommerceApplication.model.User;


public interface UserRepository extends MongoRepository<User,Integer>{

}
