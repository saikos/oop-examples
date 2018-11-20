package org.afdemp.cb6.ex03.geom;

public class Circle extends ShapeBase {
  
    public double radius;
    
    public Circle(Point p, double radius) {
        super(p);
        this.radius   = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

            
}
