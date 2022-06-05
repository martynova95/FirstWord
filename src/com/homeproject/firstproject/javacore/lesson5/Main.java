package com.homeproject.firstproject.javacore.lesson5;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("1.txt");
        System.out.println(file.exists());

        file.createNewFile();

        AppData appData = new AppData();
        appData.load("1.txt");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));
    }
}
