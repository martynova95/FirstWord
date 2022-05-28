package com.homeproject.firstproject.lesson6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Боня", 4, 15, 250);
        Dog dog = new Dog("Фроська", 2, 10, 499);


        System.out.println(cat.toString());
        System.out.println(dog.toString());

        cat.swim(0);
        dog.swim(10);

        cat.run(200);
        dog.run(500);
    }
}
