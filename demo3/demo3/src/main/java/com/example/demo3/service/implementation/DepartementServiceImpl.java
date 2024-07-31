package com.example.demo3.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo3.model.Departement;
import com.example.demo3.repository.DepartementRepository;
import com.example.demo3.service.DepartementService;


@Service
public class DepartementServiceImpl implements DepartementService{

    @Autowired
    private DepartementRepository departementRepository;


    @Override
    public List<Departement> get() {
        return departementRepository.findAll();
    }

    @Override
    public Departement get(Integer key) {
       return departementRepository.findById(key).orElse(null);
    }

    @Override
    public Boolean save(Departement entity) {
       Departement departement = departementRepository.save(entity);
       return departement.getDepartementID().equals(null);

    // Departement savedDepartement = departementRepository.save(entity);
    // return savedDepartement.getDepartemenID() != null;

    }

    @Override
    public Boolean delete(Integer idInteger){
        departementRepository.deleteById(idInteger);
        return departementRepository.findById(idInteger).isEmpty();
    }
    
    
}
