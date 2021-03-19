package com.dj.fin.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public class Base extends PanacheEntity {
    Date createAt;
    Date updateAt;
}
