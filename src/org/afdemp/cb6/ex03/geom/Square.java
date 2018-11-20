package org.afdemp.cb6.ex03.geom;

public class Square extends ShapeBase {
    
    private double edge;
    
    public Square(Point p, double edge) {
        super(p);
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return Math.pow(edge, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * edge;
    }
    
}
