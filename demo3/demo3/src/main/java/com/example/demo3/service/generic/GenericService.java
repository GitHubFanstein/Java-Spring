package com.example.demo3.service.generic;
import java.util.List;


public interface GenericService<Entity, Key> {
    
    public List<Entity> get();

    public Entity get(Key key);

    public Boolean save(Entity entity);

    public Boolean delete(Integer idInteger);

}
