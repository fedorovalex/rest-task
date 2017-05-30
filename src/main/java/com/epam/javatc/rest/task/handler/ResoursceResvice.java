package com.epam.javatc.rest.task.handler;

import com.epam.javatc.rest.task.model.Product;
import com.epam.javatc.rest.task.model.Report;
import com.epam.javatc.rest.task.model.SalePoint;
import com.epam.javatc.rest.task.model.localstorage.ProductLocal;
import com.epam.javatc.rest.task.model.localstorage.ReportLocal;
import com.epam.javatc.rest.task.model.localstorage.SalePointLocal;
import java.util.HashSet;
import java.util.Set;

public class ResoursceResvice {

    public Set<SalePoint> getSalePoints() {
        return SalePointLocal.get().getSetSalePoints();
    }

    public Set<Product> getProducts(String name) {

        Set<Product> products = new HashSet<>();

        for (Report report : ReportLocal.get().getSetReports()) {
            if (report.getSalePoint().getName().equals(name)) {
                products.add(report.getProduct());
            }
        }

        return products;
    }
    
    public void addSalePoint(SalePoint salePoint) {
        SalePointLocal.get().add(salePoint);
    }
    
    public void addProduct(Product product) {
        ProductLocal.get().add(product);
    }
}
