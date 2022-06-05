package com.homeproject.firstproject;

import java.util.Arrays;

public class HomeWorkLesson3 {
    public static void main(String[] args) {

        // Задание 1.
            int[] arr = { 1, 0, 1, 0, 0, 1 };
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
            }
        System.out.println(Arrays.toString(arr));


            // Задание 2.
            int[] array = new int[100];
            array[0] = 1;
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i - 1] + 1;
            }
            System.out.println(Arrays.toString(array));


            //Задание 3.
            int[] newArr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
            for (int i = 0; i < newArr.length; i++) {
                if (newArr[i] < 6) {
                    newArr[i] = newArr[i] * 2;
                }
            }
            System.out.println(Arrays.toString(newArr));


            //Задание 4.
            int [][] newArray = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (i == j || j == i) {
                        newArray[i][j] = 1;
                    } else {
                        newArray[i][j] = 0;
                    }
                    System.out.print(" " + newArray[i][j] + " ");
                }
                System.out.println();


        }

        //Задание 5.
        printArray(lenArr(4, 6));

        }

        public static int[] lenArr (int len, int initialValue) {
        int nArr[] = new int[len];
        for (int i= 0; i < nArr.length; i++) {
            nArr[i] = initialValue;
        } return nArr;
        }

        public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
        }

    }

