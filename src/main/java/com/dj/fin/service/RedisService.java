package com.dj.fin.service;

import io.agroal.api.AgroalDataSource;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class RedisService {
//    @Inject
//    RedisClient redisClient;

    @Inject
    AgroalDataSource defaultDataSource;

    @Inject
    EntityManager em;

    public String greeting(String name) {
        return "hello " + name;
    }

}
