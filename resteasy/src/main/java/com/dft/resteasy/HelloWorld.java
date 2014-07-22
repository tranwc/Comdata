package com.dft.resteasy;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
@Path("/sampleservice")
public class HelloWorld 
{
	

	
	@GET
	@Path("/hello")
	@Produces("text/plain")
	public String hello()
	{
	    return "Hello World";
	}
    
    @GET
    @Path("/echo/{message}")
    @Produces("text/plain")
    public String echo(@PathParam("message")String message)
    {
    	return message;
    }
    
}
