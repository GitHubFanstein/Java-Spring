package com.example.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo3.model.Leave;

@Repository
public interface LeaveRepository extends JpaRepository<Leave, Long> {
    
}
