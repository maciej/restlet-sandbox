package org.inszy.restletsandbox;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Maciej Bilas
 * @since 31/1/12 22:36
 */
@Path("/")
public class SampleResource {

    @GET
    @Produces("text/plain")
    public String root() {
        return "foo bar";
    }
}
