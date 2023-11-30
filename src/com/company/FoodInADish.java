package com.company;

public class FoodInADish<T> extends DrawableObject implements Comparable<FoodInADish<T>>{
    private T food;
    private String dishColor;

    @Override
    public void draw() {

    }

    @Override
    public int compareTo(FoodInADish<T> o) {
        return 0;
    }
}
