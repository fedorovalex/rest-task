package com.epam.javatc.rest.task.model.filling;

import com.epam.javatc.rest.task.model.Product;
import com.epam.javatc.rest.task.model.Report;
import com.epam.javatc.rest.task.model.SalePoint;
import com.epam.javatc.rest.task.model.localstorage.ProductLocal;
import com.epam.javatc.rest.task.model.localstorage.SalePointLocal;
import java.text.SimpleDateFormat;
import java.util.Map;

public class Creator {

    private final Map<String, SalePoint> salePoints = SalePointLocal.get().getMapSalePoints();
    private final Map<String, Product> products = ProductLocal.get().getMapProducts();
    private final DateAdapter dateAdapter = new DateAdapter(new SimpleDateFormat("yyyy-MM-dd"));

    public Report createReport(String product, String salePoint, String date, int amount) {

        return new Report(
                products.get(product),
                salePoints.get(salePoint),
                dateAdapter.toDateFormat(date),
                amount
        );
    }
}
