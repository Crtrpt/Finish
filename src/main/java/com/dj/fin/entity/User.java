package com.dj.fin.entity;



import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class User  extends Base {

    private String name;

    private String avatar;

    /**
     * 用户参与的项目
     */
    @OneToMany(mappedBy = "user")
    Set<ProjectUser> projects;

    /**
     * 用户需要处理的task
     */
    @OneToMany(mappedBy = "user")
    Set<TaskUser> tasks;

    private String tags;
}
