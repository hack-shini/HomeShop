package com.comenda.HomeShop;

import java.util.Map;

public class Bill {

    private Customer customer;

    private Map<Product, Integer> products;

    /**
     * Add product with quantity in a Bill
     * @param product product to add
     * @param quantity quantity of product
     */

    public void addProduct(Product product, Integer quantity){
        this.products.put(product, quantity);
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}

