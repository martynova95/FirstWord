package com.homeproject.firstproject.javacore.lesson2;

public class lesson2 {
    public static void main(String[] args) {
        lesson2 main = new lesson2();
        String [][] arr = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        String [][] arr1 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3"},
                {"1", "2", "3", "4"}
        };
        String [][] arr2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"fff", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        try {
            main.stringExceptionTest(arr);
            main.stringExceptionTest(arr1);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(sumOfMatrix(arr));
            System.out.println(sumOfMatrix(arr2));
        } catch (MyArrayDataException ex) {
            ex.printStackTrace();
        }
    }

    public void stringExceptionTest(String[][] arr) throws MyArraySizeException {
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException(String.format("Неверное количество столбцов в %d-й" + " строке", i));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static int sumOfMatrix(String[][] matrix) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
