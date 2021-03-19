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
public class ProjectResourceJaxRs {

    @Inject
    UserRepository userRepository;

    @GET
    @Path("/project/{id}")
    @Produces("application/json")
    public Response get(@Valid @PathParam("id")@NotNull long id) throws Exception {
        System.out.println("获取");

        var user=userRepository.findById(id);
        if(user==null){
            throw new BzException("user is null");
        }

        return  Response.ok(user.id).build();
    }
}