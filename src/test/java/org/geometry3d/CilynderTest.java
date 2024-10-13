package org.geometry3d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CilynderTest {
    @Test
    void area() {
        Cilynder cilynder = new Cilynder(1, 1);
        assertEquals("6,28", String.format("%.2f",cilynder.area()));
    }

    @Test
    void volume() {
        Cilynder cilynder = new Cilynder(2, 2);
        assertEquals("25,13", String.format("%.2f", cilynder.volume()));
    }
}