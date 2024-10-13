package org.geometry2d;

import org.exceptions.FigureNotExistsException;

public class Circle implements Figure{
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double radius){
        try {
            if (radius <=0)
                throw new FigureNotExistsException(this.getClass().getSimpleName());
            this.radius = radius;
        } catch (FigureNotExistsException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public double area() {
        return (PI* radius * radius);
    }

    @Override
    public double perimeter() {
        return (2*PI* radius);
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "\n" +
                "radius = " + radius + ";\n" +
                "area = " + area() + ";\n" +
                "perimeter = " + perimeter() + ';';
    }
}
