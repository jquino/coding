package com.jalasoft.selenium.jose.shape;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jose Rioja on 3/6/2017.
 */
public class CircleTest {

    private static final int DELTA = 0;
    private static final int radius = 5;
    private static final double PI = 3.1416;
    private Shape circle;

    @Before
    public void setUp() {
        //Given
        circle = new Circle(radius);  //Always instantiate through the abstract class
    }

    @Test
    public void testCalculateAreaWhen() {
        //When
        final double actualArea = circle.calculateArea();

        //Then
        final double expectedArea = PI * radius * radius;
        assertEquals(expectedArea, actualArea, DELTA);
    }

    @Test
    public void testCalculatePerimeterWhen() {
        //When
        final double actualPerimeter = circle.calculatePerimeter();

        //Then
        final double expectedPerimeter = 2 * PI * radius;
        assertEquals(expectedPerimeter, actualPerimeter, DELTA);
    }
}