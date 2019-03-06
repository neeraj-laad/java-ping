package serverless.openliberty.api;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;;

@Path("/ping")
public class PingPong {

    @GET
    public Response ping() {
        return Response.ok("Ping!!!!!+++++")
                .build();
    }

    @POST
    public Response pong() {
        return Response.ok("Pong!")
                .build();
    }

    @DELETE
    public Response delete() {
        return Response.ok("Deleted")
                .build();
    }
} 
