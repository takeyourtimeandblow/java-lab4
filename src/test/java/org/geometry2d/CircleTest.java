package org.geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {
    @Test
    void Circle(){
        Circle circle = new Circle(-1);
    }

    @Test
    void area() {
        Circle circle = new Circle(5);
        assertEquals("78,5", String.format("%.1f",circle.area()));
    }

    @Test
    void perimeter() {
        Circle circle = new Circle(4);
        assertEquals("25,13", String.format("%.2f",circle.perimeter()));
    }
}