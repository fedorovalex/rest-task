package com.epam.javatc.rest.task.model;

import java.util.Date;
import java.util.Objects;

public class Report {

    private Product product;
    private SalePoint salePoint;
    private Date data;
    private int amount;
    private int cost;
    

    public Report() {
    }

    public Report(Product product, SalePoint salePoint, Date data, int amount) {
        this.product = product.clone();
        this.salePoint = salePoint.clone();
        this.data = (Date) data.clone();
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product.clone();
    }

    public SalePoint getSalePoint() {
        return salePoint;
    }

    public void setSalePoint(SalePoint salePoint) {
        this.salePoint = salePoint.clone();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = (Date) data.clone();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.product);
        hash = 97 * hash + Objects.hashCode(this.salePoint);
        hash = 97 * hash + Objects.hashCode(this.data);
        hash = 97 * hash + this.amount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Report other = (Report) obj;
        if (this.amount != other.amount) {
            return false;
        }
        if (!this.product.equals(other.product)) {
            return false;
        }
        if (!this.salePoint.equals(other.salePoint)) {
            return false;
        }
        if (!this.data.equals(other.data)) {
            return false;
        }
        return true;
    }

}
