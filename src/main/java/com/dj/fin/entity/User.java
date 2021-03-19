package com.dj.fin.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    List<Team> teams;
}
