package com.homeproject.firstproject.javacore.lesson3.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(1));
        appleBox.addFruit(new Apple(1));
        appleBox.addFruit(new Apple(1));
        appleBox.addFruit(new Apple(1));
        System.out.println(appleBox.getWeight());

        Box<Apple> appleBox2 = new Box<>();
        appleBox.addFruit(new Apple(1));
        appleBox.addFruit(new Apple(1));

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange(1));
        orangeBox.addFruit(new Orange(1));
        System.out.println(orangeBox.getWeight());


        appleBox.pour(appleBox2);
        System.out.println(appleBox.getList());
        System.out.println(appleBox2.getList());


    }
}
