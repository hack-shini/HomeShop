package com.comenda.HomeShop;

import java.util.Map;

public class Bill {

    // get = Donner   :::-> On récupère une valeur  || Lecture
    // set = Modifier :::-> On modifie une valeur   || Ecriture

    private Customer customer;

    private Map<Product, Integer> products;

    public Bill(Customer customer) {
        this.customer = customer;
    }

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

