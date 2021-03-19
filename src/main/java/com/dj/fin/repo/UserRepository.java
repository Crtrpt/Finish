package com.dj.fin.repo;


import com.dj.fin.entity.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import lombok.Data;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {
    public User findByName(String name){
        return find("name", name).firstResult();
    }
}