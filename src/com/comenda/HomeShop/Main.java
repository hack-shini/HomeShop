package com.comenda.HomeShop;

import com.comenda.HomeShop.Electro.Fridge;
import com.comenda.HomeShop.Electro.Television;
import com.comenda.HomeShop.garage.Car;
import com.comenda.HomeShop.garage.Parisien;
import com.comenda.HomeShop.garage.Plane;
import com.comenda.HomeShop.garage.Taxi;

import java.util.ArrayList;
import java.util.Collections;

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

        Plane avion = new Plane("Avion de ligne Boeing 747","Air France","Boeing 747", "White", 790,
                2018,26,new int[]{40000,10000,20000});

        System.out.println(fridge.getLiter());

        Bill bill = new Bill(customer);

        System.out.println(bill.getCustomer().getFullname());

        bill.addProduct(cafe,2);
        bill.addProduct(tv,10);
        bill.addProduct(fridge,1);


        Product tv2 = new Television("tv","samsung",299,170,"LED");

        System.out.println(((Television) tv2).getSize());

        car.start();


        Parisien Aurelie = new Parisien();

        Taxi taxi = new Taxi();

        Aurelie.seDeplacer(avion);
        Aurelie.seDeplacer(taxi);






    }

}
