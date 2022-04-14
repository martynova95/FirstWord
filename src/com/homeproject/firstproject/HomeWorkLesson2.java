package com.homeproject.firstproject;

public class HomeWorkLesson2 {

    public static void main(String[] args) {
        System.out.println(within10and20(6,77));

        isPozitiveOrNegative(15);

        System.out.println(isNegative(-546));

        printWordNTimes("Хорошего дня!",2);

        System.out.println(years(1900));
    }

        public static boolean within10and20(int a, int b) {
        int sum = a + b;
            if (sum >= 10 && sum <= 20) {
                return true;
            } else {
                return false;
            }
        }

        public static void isPozitiveOrNegative(int y) {
        if (y >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
        }

        public static boolean isNegative (int x) {
        if (x < 0) {
            return true;
        }
        return false;
        }

        public static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println(word);
        }
        }

        public static boolean years(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
        }

}
