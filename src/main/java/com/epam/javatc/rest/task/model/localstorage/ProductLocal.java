package com.epam.javatc.rest.task.model.localstorage;

import com.epam.javatc.rest.task.model.Product;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductLocal {

    private static final ProductLocal PRODUCT_LOCAL = new ProductLocal();
    private final Map<String, Product> products;

    private ProductLocal() {

        products = new HashMap<>();
        products.put("cube", new Product(0, "DaYan 5 ZhanChi"));
        products.put("pyramid", new Product(1, "MoFangGe X-man Bell Pyraminx"));
        products.put("skewb", new Product(2, "DaYan Skewb"));

    }

    public static ProductLocal get() {
        return PRODUCT_LOCAL;
    }

    public Map<String, Product> getMapProducts() {
        return products;
    }
    
    public void add(Product product) {
        products.put(product.getName(), product);
    }

    public Set<Product> getSetProducts() {
        Set<Product> productsSet = new HashSet<>(products.values());
        return productsSet;
    }

}
