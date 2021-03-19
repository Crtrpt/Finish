package com.dj.fin.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class Project extends Base {

    private String name;

    private String icon;

    @OneToMany(mappedBy = "project")
    Set<ProjectUser> projects;

    @OneToOne
    private Project parent;

    private String tags;
}
