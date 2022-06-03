package com.homeproject.firstproject.lesson7;

public class Cat {
    private int appetite;
    private String name;
    private boolean hungry;

    public Cat(int appetite, String name) {
        this.appetite = appetite;
        this.name = name;
        this.hungry = true;
    }


    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public void info() {
        String isHungry = !hungry ? " сыт" : " голоден";
        System.out.println(name + isHungry);
    }

    public void eat(Plate plate){
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }
}
