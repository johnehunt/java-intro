package com.midmarsh.echo;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/hello")
public class Echo {

    @GET
    @Path("{id}")
    @Consumes("text/plain")
    @Produces("text/plain")
    public String getMessage(@PathParam("id") String param) {
        return "Hello " + param + " " + (new Date());
    }

}
