package com.midmarsh.trades;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/trades")
public class TradeService {

    private List<Trade> trades;

    public TradeService() {
        this.trades = Arrays.asList(new Trade("1", "IBM", 10), new Trade("2", "GOOG", 15));
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllTrades() {
        GenericEntity<List<Trade>> entities = new GenericEntity<List<Trade>>(this.trades){};
        return Response.status(Response.Status.OK).entity(entities).build();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTrade(@PathParam("id") String id) {
        System.out.println("Request received for trade " + id);
        Trade trade = this.trades.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        if (trade == null) {
            Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Trade not found").build();
        }
        return Response.status(Response.Status.OK).entity(trade).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addTrade(Trade trade) {
        trades.add(trade);
        return Response.status(Response.Status.OK).build();
    }
    

}
