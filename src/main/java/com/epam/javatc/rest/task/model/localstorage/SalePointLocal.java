package com.epam.javatc.rest.task.model.localstorage;

import com.epam.javatc.rest.task.model.SalePoint;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SalePointLocal {

    private static final SalePointLocal SALE_POINT_LOCAL = new SalePointLocal();
    private final Map<String, SalePoint> salePoints;

    private SalePointLocal() {

        salePoints = new HashMap<>();
        salePoints.put("ali", new SalePoint(0, "aliexpress", "ru.aliexpress.com"));
        salePoints.put("ozon", new SalePoint(1, "ozon", "www.ozon.ru"));
        salePoints.put("ulmart", new SalePoint(2, "ulmart", "www.ulmart.ru"));
    }

    public static SalePointLocal get() {
        return SALE_POINT_LOCAL;
    }

    public Map<String, SalePoint> getMapSalePoints() {
        return salePoints;
    }
    
    public void add(SalePoint salePoint) {
        salePoints.put(salePoint.getName(), salePoint);
    }

    public Set<SalePoint> getSetSalePoints() {
        Set<SalePoint> salePointSet = new HashSet<>(salePoints.values());
        return salePointSet;
    }

}
