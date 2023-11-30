package com.company;

public abstract class  DrawableObject {
    private int x;
    private int y;
    private int height;
    private int width;
    public abstract void draw();

    public DrawableObject(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
    public DrawableObject() {
        this.x = 0;
        this.y = 0;
        this.height = 0;
        this.width = 0;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
