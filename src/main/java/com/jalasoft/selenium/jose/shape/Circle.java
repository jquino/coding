package com.jalasoft.selenium.jose.shape;

/**
 * Created by Jose Rioja on 3/4/2017.
 */
public class Circle extends Shape {
    private static final double PI = 3.1416;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return this.PI * this.radius * this.radius;
    }

    public double calculatePerimeter() {
        return 2 * this.PI * this.radius;
    }
}