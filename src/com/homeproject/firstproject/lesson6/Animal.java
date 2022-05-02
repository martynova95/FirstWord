package com.homeproject.firstproject.lesson6;

public abstract class Animal {
    private String name;
    private int age;
    private int swimmingDistance;
    private int runningDistance;

    public  Animal(String name, int age, int swimmingDistance, int runningDistance) {
        this.name = name;
        this.age = age;
        this.swimmingDistance = swimmingDistance;
        this.runningDistance = runningDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSwimmingDistance() {
        return swimmingDistance;
    }

    public void setSwimmingDistance(int swimmingDistance) {
        this.swimmingDistance = swimmingDistance;
    }

    public int getRunningDistance() {
        return runningDistance;
    }

    public void setRunningDistance(int runningDistance) {
        this.runningDistance = runningDistance;
    }

    public String toString() {
        return "Name is " + name + " age is " + age;
    }


    public abstract void run(int distance);

    public abstract void swim(int distance);
}
