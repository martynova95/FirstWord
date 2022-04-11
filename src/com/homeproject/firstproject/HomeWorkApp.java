package com.homeproject.firstproject;

public class HomeWorkApp {

    public static void main(String[] args){

        System.out.println("Hello, World!");

        printThreeWords();

        checkSumSing ();

        printColor ();

        compareNumbers();
    }


    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSing () {
        int a = 3;
        int b = 5;

        if (a+b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor () {
        int value = 105;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }
        if (value > 100) {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 6;
        int b = 19;

        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
