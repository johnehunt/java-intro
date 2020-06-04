package com.midmarsh.echoclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

public class App {
    public static void main(String[] args) {
        
        System.out.println("Obtaining RESTful client");
        Client client = ClientBuilder.newClient();
        
        System.out.println("Configuring request");
        String message = client.target("http://localhost:8080/25-echo-service/rest/hello/john")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);
        
        System.out.println("message: " + message);
        
        System.out.println("Closing client");
        client.close();
        
        System.out.println("Done");
        
    }
}
