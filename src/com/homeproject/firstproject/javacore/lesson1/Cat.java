package com.homeproject.firstproject.javacore.lesson1;

public class Cat extends Animal implements Swimable, Jumpable{
    private double swimLimit;
    private double jumpLimit;


    public Cat(String name, int runLimit, double swimLimit, double jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.jumpLimit = jumpLimit;
    }


    @Override
    public String voice() {
        return "Мяу!";
    }

    public boolean swim(double length) {
        return swimLimit >= length;
    }

    public boolean jump(double height) {
        return jumpLimit >= height;
    }

    public double getSwimLimit() {
        return swimLimit;
    }

    public void setSwimLimit(double swimLimit) {
        this.swimLimit = swimLimit;
    }

    public double getJumpLimit() {
        return jumpLimit;
    }

    public void setJumpLimit(double jumpLimit) {
        this.jumpLimit = jumpLimit;
    }


}
