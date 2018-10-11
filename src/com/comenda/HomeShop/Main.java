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

        Product cafe = new Product("Philips","Fait du café 1 - 2 Tasses", 79.99);
        Television tv = new Television("LG OQLED", "Télèvision incurvé",1999,170, "LED");
        Fridge fridge = new Fridge("BEKO","Frigo beko gris aluminium", 459.99, 460, false);
        Customer customer = new Customer("Wyatt Dos Reis Comenda", "Péage de Roussillon");

        Bill bill = new Bill(customer, new DirectDelivery());


        bill.addProduct(cafe,1);
        bill.addProduct(tv,1);
        bill.addProduct(fridge,1);

        bill.generate(new Writer() {
            @Override
            public void start() {

            }

            @Override
            public void writeLine(String line) {
                System.out.println(line);
            }

            @Override
            public void stop() {

            }
        });
    }

}
