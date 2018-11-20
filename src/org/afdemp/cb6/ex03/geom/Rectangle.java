package org.afdemp.cb6.ex03.geom;

public class Rectangle extends ShapeBase {
    
    private double width;
    private double height;
    
    public Rectangle(Point p, double width, double height) {
        super(p);
        this.width  = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
           
}
