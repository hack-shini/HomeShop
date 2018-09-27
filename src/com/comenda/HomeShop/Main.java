package com.comenda.HomeShop;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Dimitri", "Péage de Roussillon");

        System.out.println(customer.fullname);
        System.out.println(customer.adress);

    }

}
