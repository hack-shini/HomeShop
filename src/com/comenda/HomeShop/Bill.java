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


    /**
     * Generate an OutPut for the current Bill
     * @param writer object in charge of writing
     */
    public void generate(Writer writer){
        writer.start();
        writer.writeLine("HomeShop Compagnie");
        writer.writeLine("1 Place Charles de Gaulle, 75008 Paris");
        writer.writeLine("");
        writer.writeLine("Facture à l'attention de : ");
        writer.writeLine(customer.getFullname());
        writer.writeLine(customer.getAdress());
        writer.writeLine("");
        writer.writeLine("Mode de livraison " + delivery.getInfo());
        writer.writeLine("");
        writer.writeLine("Produits : ");
        writer.writeLine("----------------------------------------------");
        for (Map.Entry<Product, Integer> entry : products.entrySet()){
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            writer.writeLine(product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s)");
            writer.writeLine(product.getDescription());
            writer.writeLine("");
        }
        writer.writeLine("livraison : " + delivery.getPrice());
        writer.writeLine("----------------------------------------------");
        writer.writeLine("Total : " + this.getTotal());
        writer.stop();

    }



    // ALL GETTERS AND SETTERS

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public double getTotal(){
        double total = delivery.getPrice();
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            Product product = entry.getKey();
            Integer quantity = entry.getValue();
            total += product.getPrice() * quantity;
        }
        return total;
    }

}

