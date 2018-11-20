package org.afdemp.cb6.ex03.geom;

/*
 * An abstract class introduced to provide a common implementation
   for some method(s) of an interface.
   In Java 8+ we can define interfaces with default implementations
   for the abstract methods.
 */
public abstract class ShapeBase implements Shape {

    private final Point startingPoint;
    
    public ShapeBase(Point startingPoint) {
        this.startingPoint = startingPoint;
    }

    @Override
    public Point getStartingPoint() {
        return startingPoint;
    }
        
    
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
    
}
