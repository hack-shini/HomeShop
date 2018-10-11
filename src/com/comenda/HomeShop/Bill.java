package com.comenda.HomeShop;

import com.sun.security.ntlm.Client;

import java.util.HashMap;
import java.util.Map;

public class Bill{

    // get = Donner   :::-> On récupère une valeur  || Lecture
    // set = Modifier :::-> On modifie une valeur   || Ecriture



    // ALL ATTRIBUTS

    private Customer customer;
    private Delivery delivery;
    private Map<Product, Integer> products = new HashMap<Product, Integer>();




    // --- CONSTRUCTORS

    public Bill(Customer customer) {
        this.customer = customer;
    }


    public Bill (Customer customer, Delivery delivery){
        this.customer = customer;
        this.delivery = delivery;
    }




    // ALL OTHERS METHODS

    /**
     * Add product with quantity in a Bill
     * @param product product to add
     * @param quantity quantity of product
     */

    public void addProduct(Product product, Integer quantity){
        this.products.put(product, quantity);
    }

    public void generate(Writer){

    }



    // ALL GETTERS AND SETTERS

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public double getTotal(){
        return getTotal();
    }

}

