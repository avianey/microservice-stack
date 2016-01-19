package fr.avianey.spring.microservice.jaxrs;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Named
@Path("helloworld")
public class HelloWorldEndpoint {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String sayHello() {
        return "Hello, world!";
    }

}
