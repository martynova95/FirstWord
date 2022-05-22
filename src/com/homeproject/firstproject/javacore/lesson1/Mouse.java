package com.homeproject.firstproject.javacore.lesson1;

public class Mouse extends Animal implements Jumpable {
    private double jumpLimit;


    public Mouse(String name, int runLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    @Override
    public String voice() {
        return "Пи-пи-пи";
    }

    public boolean jump(double height) {
        return jumpLimit >= height;
    }

    public double getJumpLimit() {
        return jumpLimit;
    }

    public void setJumpLimit(double jumpLimit) {
        this.jumpLimit = jumpLimit;
    }


}
