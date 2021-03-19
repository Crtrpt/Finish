package com.dj.fin.repo;


import com.dj.fin.entity.Project;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class ProjectRepository implements PanacheRepository<Project> {
    public Project findByName(String name){
        return find("name", name).firstResult();
    }
}