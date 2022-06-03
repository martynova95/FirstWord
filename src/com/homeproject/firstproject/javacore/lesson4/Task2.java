package com.homeproject.firstproject.javacore.lesson4;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }

    private static void task2() {
        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "89470309975");
        pb.add("Ivanov", "89378489920");
        pb.add("Nazarov", "84933040300");
        pb.add("Sidorova", "89477773965");
        pb.add("Orlova", "89477773829");
        pb.add("Pushkin", "89468883920");
        pb.add("Pushkin", "89438507383");
        pb.add("Antonov", "89307589276");

        System.out.println(pb.get("Ivanov"));
        System.out.println(pb.get("Pushkin"));
        System.out.println(pb.get("Sidorova"));
        System.out.println(pb.get("Orlova"));
    }



}
