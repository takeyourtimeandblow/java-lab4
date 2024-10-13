package org.geometry2d;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void area() {
        Rectangle cub = new Rectangle(2, 2);
        assertEquals(4, cub.area());


    }

    @Test
    void perimeter() {
        Rectangle rect = new Rectangle(8, 2);
        assertEquals(20, rect.perimeter());
    }
}