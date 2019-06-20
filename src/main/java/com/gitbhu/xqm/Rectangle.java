package com.gitbhu.xqm;

public class Rectangle {
    private int width;
    private int length;

    Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    int getPerimeter() {
        return 2 * (this.width + this.length);
    }

    int getAcreage() {
        return this.width * this.length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}
