package com.jalasoft.selenium.jose.shape;

/**
 * Created by Jose Rioja on 3/4/2017.
 */
public class Circle extends Shape {
    private double radius;

    /**
     * Circle constructor.
     * @param radius It is the radius of the circle.
     */
    Circle(final double radius) {
        this.radius = radius;
    }

    /**
     * This method calculates the area of the circle.
     * @return returns the circle's area.
     */
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * This methods calculates the perimeter of the circle.
     * @return returns the circle's perimeter.
     */
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
