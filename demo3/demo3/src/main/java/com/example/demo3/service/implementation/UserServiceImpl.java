package com.example.demo3.service.implementation;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo3.model.User;
import com.example.demo3.repository.UserRepository;
import com.example.demo3.service.UserService;


@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> get() {
       return userRepository.findAll();
    }

    @Override
    public User get(Integer key) {
        return userRepository.findById(key).orElse(null);
    }

    @Override
    public Boolean save(User entity) {
       User user = userRepository.save(entity);
        return user.getUserId().equals(null);
    }

    @Override
    public Boolean delete(Integer idInteger) {
        userRepository.deleteById(idInteger);
        return userRepository.findById(idInteger).isEmpty();
    }


    public User authenticate(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    
}
