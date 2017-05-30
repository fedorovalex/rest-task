package com.epam.javatc.rest.task.handler;

import com.epam.javatc.rest.task.model.Product;
import com.epam.javatc.rest.task.model.SalePoint;
import java.util.Set;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(value = "/get")
public class GetResources {
    
    @GET
    @Path(value = "/salePoints")
    @Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Set<SalePoint> getSalePoints() {
        ResoursceResvice resoursceResvice = new ResoursceResvice();
        return resoursceResvice.getSalePoints();
    }
    
    @GET
    @Path(value = "/products/{name}")
    @Produces(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Set<Product> getProducts(@PathParam("name") String name) {
        
        ResoursceResvice resoursceResvice = new ResoursceResvice();
        
        return resoursceResvice.getProducts(name);
    }
}
