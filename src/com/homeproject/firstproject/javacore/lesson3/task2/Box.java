package com.homeproject.firstproject.javacore.lesson3.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Box<T extends Fruit> {

    private ArrayList<T> list; //= new ArrayList<>();

    public Box() {
        this.list = new ArrayList<>();
    }

    public ArrayList<T> getList() {
        return list;
    }

    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    /*public void addFruit(T fruit) {
        list.add(fruit);
    }

    public float getWeight() {
        return list.size() * list.get(0).getWeight();
    }

    public void pour(Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }

    @Override
    public String toString() {
        return "Box{" +
                "list=" + list +
                '}';
    }*/

    public Box(T... fruits) {
        this.list = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0.0f;

        for (T o : list) {
            weight += o.getWeight();
        }
        return weight;
    }

    public void pour(Box<T> another) {
        another.list.addAll(list);
        list.clear();
    }

    public void addFruit(T fruit) {
        list.add(fruit);
    }

    public void add(Collection<T> fruit) {
        list.addAll(fruit);
    }

    public boolean compare(Box<?> o) {
        return Math.abs(this.getWeight() - o.getWeight()) < 0.001;
    }

    @Override
    public String toString() {
        return "Box{" +
                "list=" + list +
                '}';
    }
}
