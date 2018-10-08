package com.comenda.HomeShop;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class Main {


    public static void main(String[] args) {

        Customer customer = new Customer("Dimitri Dos Reis Comenda", "Péage de Roussillon");

//        Personne personne1 = new Personne("Dimitri");
//
//        personne1.setAge(27);
//
//        System.out.println(personne1.getAge());

        Car car = new Car("Audi R8 année 2018", "Audi", "Audi R8 V10", "Noir", 400, 2018, 1124,
                new int[]{4032, 1420, 1500}, 2, 12, "V10", new ArrayList<String>(Collections.singleton("test")) {
        });

        Product cafe = new Product("Philips","Fait du café 1 - 2 Tasses", 79.99);

        Television tv = new Television("LG OQLED", "Télèvision incurvé",1999,170, "LED");

        Fridge fridge = new Fridge("BEKO","Frigo beko gris aluminium", 459.99, 460, false);

        System.out.println(fridge.getLiter());

        Bill bill = new Bill(customer);

        System.out.println(bill.getCustomer().getFullname());

        bill.addProduct(cafe,2);
        bill.addProduct(tv,10);
        bill.addProduct(fridge,1);



    }

}
