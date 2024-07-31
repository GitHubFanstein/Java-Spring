package com.example.demo3.service.generic;

import java.util.List;

import com.example.demo3.model.User;



public interface UserGenericService<Entity, Key> {
    public List<Entity> get();

    public Entity get(Key key);

    public Boolean save(Entity entity);

    public Boolean delete(Integer idInteger);
    
     public User authenticate(String username, String password);
}