package com.example.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo3.model.User;

@Repository
 public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);

    
}