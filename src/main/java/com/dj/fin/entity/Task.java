package com.dj.fin.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.Date;
import java.util.Set;

@Data
@Entity
public class Task extends Base {

    private String name;

    @OneToOne
    private Project project;

    @OneToMany(mappedBy = "task")
    Set<TaskUser> users;

    @OneToOne
    private Task parent;

    Date createAt;
}
