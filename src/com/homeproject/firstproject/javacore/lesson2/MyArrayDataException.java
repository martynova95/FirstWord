package com.homeproject.firstproject.javacore.lesson2;

public class MyArrayDataException extends NumberFormatException{
    MyArrayDataException(int row, int col) {
        super(String.format("Недопустимые данные в %d строке, %d столбце", row, col));
    }
}
