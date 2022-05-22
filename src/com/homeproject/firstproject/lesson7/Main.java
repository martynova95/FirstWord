package com.homeproject.firstproject.lesson7;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat(10, "Murzik"), new Cat(15, "Barsik"), new Cat(20, "Bonya"), new Cat(5, "Kuzya"), new Cat (35, "Motya")};
        Plate plate = new Plate(40);

        for (Cat cat: cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.addFood(50);
        plate.info();

    }
}
