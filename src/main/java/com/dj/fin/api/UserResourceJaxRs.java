package com.dj.fin.api;

import com.dj.fin.BzException;
import com.dj.fin.repo.UserRepository;
import io.smallrye.common.constraint.NotNull;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class UserResourceJaxRs  {

    @Inject
    UserRepository userRepository;

    @GET
    @Path("/user/{id}")
    @Produces("application/json")
    public Response userInfo(@Valid @PathParam("id")@NotNull long id) throws Exception {
        return  Response.ok("TODO").build();
    }

    @GET
    @Path("/user/{id}/project")
    @Produces("application/json")
    public Response userProjects(@Valid @PathParam("id")@NotNull long id) throws Exception {
        return  Response.ok("TODO").build();
    }

    @GET
    @Path("/user/{id}/task")
    @Produces("application/json")
    public Response userTasks(@Valid @PathParam("id")@NotNull long id) throws Exception {
        return  Response.ok("TODO").build();
    }
}