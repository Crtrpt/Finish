package com.dj.fin.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestService {
    public String greeting(String name) {
        return "hello " + name;
    }

}
