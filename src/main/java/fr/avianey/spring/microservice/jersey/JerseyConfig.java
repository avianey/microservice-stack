package fr.avianey.spring.microservice.jersey;

import fr.avianey.spring.microservice.jaxrs.HelloWorldEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(HelloWorldEndpoint.class);
    }
}
