package com.dj.fin.repo;

import com.dj.fin.entity.Task;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class TaskRepository implements PanacheRepository<Optional<Task>> {
    public Optional<Task> findByName(String name){
        return find("name", name).firstResult();
    }
}