package com.homeproject.firstproject.javacore.lesson1;

public class Pool implements Let {
    private double length;

    public Pool(double length) {
        this.length = length;
    }

    public boolean doIt(Animal animal) {
        if (animal instanceof Swimable)
            return ((Swimable) animal).swim(length);
        else return false;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
