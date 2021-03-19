package com.dj.fin;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
@Slf4j
public class ExceptionHandler implements ExceptionMapper<Exception> {
    @Override
    public Response toResponse(Exception exception)
    {
        exception.printStackTrace();
        return Response.status(Response.Status.BAD_GATEWAY).entity("Network is busy, please try again later").build();
    }
}
