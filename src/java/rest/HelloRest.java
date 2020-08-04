
package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author INGRID-PC
 */
@Path("/hello")
public class HelloRest {
    
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String sayHello(){
//        return "Hello World!!";
//    }
    
    @GET
    @Path("soma/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String soma(@PathParam("a") int a, @PathParam("b") int b){
        return String.valueOf(a+b);
    }
    
}
