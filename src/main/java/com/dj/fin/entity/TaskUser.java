package com.dj.fin.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class TaskUser implements Serializable {

    @Id
    @ManyToOne
    User user;

    @Id
    @ManyToOne
    Task task;

    Date createAt;
    
}
