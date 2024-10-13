package org.geometry2d;

import org.exceptions.FigureNotExistsException;

public class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height){
        try {
            if ( width <= 0 || height <= 0 )
                throw new FigureNotExistsException(this.getClass().getSimpleName());
            this.width = width;
            this.height = height;
        } catch (FigureNotExistsException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public double area(){
        return width*height;
    }
    @Override
    public double perimeter(){
        return (width+height)*2;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "\n" +
                "width = " + width + ";\n" +
                "height = " + height + ";\n" +
                "area = " + area() + ";\n" +
                "perimeter = " + perimeter() + ';';
    }
}
