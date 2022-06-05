package com.homeproject.firstproject.javacore.lesson1;

public class Wall implements Let {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public boolean doIt(Animal animal) {
        if (animal instanceof Jumpable)
            return ((Jumpable) animal).jump(height);
        else return false;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
