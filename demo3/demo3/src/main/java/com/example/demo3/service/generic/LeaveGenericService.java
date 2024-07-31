package com.example.demo3.service.generic;

import java.util.List;

import com.example.demo3.model.Employee;
import com.example.demo3.model.Leave;

public interface LeaveGenericService<Entity, Key> {
     public List<Leave> findAll();

     public Leave findById(Long id);

     public Leave save(Leave leave);

     public void delete(Long id);

      public List<Employee> findAllKaryawan();

}
