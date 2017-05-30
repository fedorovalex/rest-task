package com.epam.javatc.rest.task.handler;

import com.epam.javatc.rest.task.model.Product;
import com.epam.javatc.rest.task.model.SalePoint;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path(value = "/add")
public class AddResources {

    @POST
    @Path("/salePoint")
    @Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void addSalePoint(SalePoint salePoint) {

        ResoursceResvice resoursceResvice = new ResoursceResvice();

        resoursceResvice.addSalePoint(salePoint);
    }

    @POST
    @Path("/product")
    @Consumes(value = {MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public void addProduct(Product product) {

        ResoursceResvice resoursceResvice = new ResoursceResvice();

        resoursceResvice.addProduct(product);
    }
}
