package com.homeproject.firstproject.lesson6;

public class Cat extends Animal{

    public Cat(String name, int age, int swimmingDistance, int runningDistance) {
        super(name, age, swimmingDistance, runningDistance);
    }

    @Override
    public void run(int distance) {
        if ((distance >= 0) && (distance >= getRunningDistance()))
            System.out.println(getName() + " пробежала " + getRunningDistance() + "m");
        else  System.out.println(getName() + " не может пробежать " + getRunningDistance() + "m");
    }


    public void swim(int distance) {
        System.out.println(getName() + " не умеет плавать");
    }
}
