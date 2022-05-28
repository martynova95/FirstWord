package com.homeproject.firstproject.javacore.lesson1;

public class Elephant extends Animal implements Swimable{
    private double swimLimit;


    public Elephant(String name, int runLimit, double swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    @Override
    public String voice() {
        return "Трууу!";
    }

    public boolean swim(double length) {
        return swimLimit >= length;
    }

    public double getSwimLimit() {
        return swimLimit;
    }

    public void setSwimLimit(double swimLimit) {
        this.swimLimit = swimLimit;
    }


}
