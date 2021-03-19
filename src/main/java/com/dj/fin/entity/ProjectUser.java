package com.dj.fin.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class ProjectUser implements Serializable {

    @Id
    @ManyToOne
    User user;

    @Id
    @ManyToOne
    Project project;

    /**
     * 加入时间
     */
    Date createAt;
}
