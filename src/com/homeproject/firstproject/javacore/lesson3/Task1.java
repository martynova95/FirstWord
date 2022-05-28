package com.homeproject.firstproject.javacore.lesson3;

import java.util.Arrays;

public class Task1 {
    public static void swapObj(Object[] array, Integer firstIndex, Integer secondIndex) {
        Object oneVal = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = oneVal;
    }



    public static void main(String[] args) {

        String[] arr1 = {"1", "2","3", "4"};
        System.out.println(Arrays.toString(arr1));
        swapObj(arr1, 0, 3);
        System.out.println(Arrays.toString(arr1));
    }
}


