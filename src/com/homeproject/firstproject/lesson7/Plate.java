package com.homeproject.firstproject.lesson7;

public class Plate {
    private int foodCount;

    public Plate(int foodCount) {
        this.foodCount = foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getFoodCount(){
        return foodCount;
    }

    public boolean decreaseFood(int amount){
        int i = foodCount - amount;
        if (i < 0) return false;

        foodCount -= amount;
        return true;
    }

    public void addFood(int amount) {
        this.foodCount += amount;
    }

    public void info(){
        System.out.println("Current food amount is " + foodCount);
    }
}
