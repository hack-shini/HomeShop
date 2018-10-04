package com.comenda.HomeShop;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        Customer customer = new Customer("Dimitri", "Péage de Roussillon");

//        Personne personne1 = new Personne("Dimitri");
//
//        personne1.setAge(27);
//
//        System.out.println(personne1.getAge());

        Car car = new Car("Audi R8 année 2018", "Audi", "Audi R8 V10", "Noir", 400, 2018, 1124,
                new int[]{4032, 1420, 1500}, 2, 12, "V10", new ArrayList<String>(Collections.singleton("test")) {
        });

        System.out.println(car.getSpeed() + " Km/h");








    }

}
