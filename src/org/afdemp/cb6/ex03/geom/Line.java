package org.afdemp.cb6.ex03.geom;

/*
 * A Line is an "aggregation" of two Points
 */
public class Line {        
    
    private Point first;
    private Point second;
    
    public Line(Point first, Point second) {
        this.first  = first;
        this.second = second;
    }
    
    /* Copy constructor - shallow copy
    public Line(Line other) {
        this.first  = other.first;
        this.second = other.second; 
    }
    */
    
    /*
     Copy constructor - deep copy
    */
    public Line(Line other) {
        Point f = other.getFirstPoint();
        Point s = other.getSecondPoint();
        
        this.first  = new Point(f.getX(), f.getY());
        this.second = new Point(s.getX(), s.getY());
    }
    
    public Point getFirstPoint() {
        return first;
    }
    
    public Point getSecondPoint() {
        return second;
    }
    
    public void setFirstPoint(Point p) {
        first = p;
    }
    
    public void setSecondPoint(Point p) {
        second = p;
    }
    
    @Override
    public String toString() {
        return first.toString() + "-" + second.toString();
    }
}
