package com.dj.fin.api;

import com.dj.fin.entity.User;
import com.dj.fin.service.TestService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/api")
public class Auth {

    @Inject
    TestService testService;

    @GET
    public Response hello() {
        return  Response.ok(new User()).build();
    }
}