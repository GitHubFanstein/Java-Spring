package com.example.demo3.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo3.model.Employee;
import com.example.demo3.model.Leave;
import com.example.demo3.repository.EmployeeRepository;
import com.example.demo3.repository.LeaveRepository;
import com.example.demo3.service.LeaveService;

@Service
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    private LeaveRepository leaveRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Leave> findAll(){
        return leaveRepository.findAll();
    }
    
    public Leave findById(Long id) {
        return leaveRepository.findById(id).orElse(null);
    }

    public Leave save(Leave leave) {
        return leaveRepository.save(leave);
    }

    public void delete(Long id) {
        leaveRepository.deleteById(id);
    }

    public List<Employee> findAllKaryawan() {
        return employeeRepository.findAll();
    }

}
