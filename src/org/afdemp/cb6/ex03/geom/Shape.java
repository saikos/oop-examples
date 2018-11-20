package org.afdemp.cb6.ex03.geom;

public interface Shape {
    
    Point getStartingPoint();
    
    double getArea();
    
    double getPerimeter();
    
    String getName();
}

/* This is equivalent to the following:

public abstract class Shape {

    public abstract double getArea();

    public abstract double getPerimeter();
    
    public abstract String getName();

}

*/
