package com.homeproject.firstproject.javacore.lesson4;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String[] words = {"one", "two", "three", "four", "five", "six", "seven", "one", "four", "eight", "nine", "nine", "ten", "six", "eleven"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println("");
    }
}
