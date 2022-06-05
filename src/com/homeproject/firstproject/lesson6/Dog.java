package com.homeproject.firstproject.lesson6;

public class Dog extends Animal{
    public Dog(String name, int age, int swimmingDistance, int runningDistance) {
        super(name, age, swimmingDistance, runningDistance);
    }


    @Override
    public void run(int distance) {
        if ((distance >= 0) && (distance >= getRunningDistance()))
            System.out.println(getName() + " пробежала " + getRunningDistance() + "m");
        else System.out.println(getName() + " не может пробежать " + getRunningDistance() + "m");
    }

    @Override
    public void swim(int distance) {
        if ((distance >= 0) && (distance >= getSwimmingDistance()))
            System.out.println(getName() + " проплыла " + getSwimmingDistance() + "m");
        else System.out.println(getName() + " не может проплыть " + getSwimmingDistance() + "m");
    }
}
