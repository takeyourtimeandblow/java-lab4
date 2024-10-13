package org.geometry3d;

import org.exceptions.FigureNotExistsException;

public class Cilynder implements Figure {
    private double height;
    private double radius;
    private static final double PI = Math.PI;

    public Cilynder(double height, double radius){
        try {
            if (height <= 0 || radius <= 0)
                throw new FigureNotExistsException(this.getClass().getSimpleName());
            this.height = height;
            this.radius = radius;
        } catch (FigureNotExistsException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public double area() { return 2*PI*radius*height; }

    @Override
    public double volume() { return PI*radius*radius*height; }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "\n" +
                "radius = " + radius + ";\n" +
                "height = " + height + ";\n" +
                "area = " + area() + ";\n" +
                "volume = " + volume() + ';';
    }
}
