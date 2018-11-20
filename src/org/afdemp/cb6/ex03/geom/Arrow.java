package org.afdemp.cb6.ex03.geom;

/* 
 * Arrow is a Line with an additional direction from first to second point
   or vice versa.
 */
public class Arrow extends Line {
    
    private boolean fromFirstToSecond;
    
    public Arrow(Point p1, Point p2, boolean fromFirstToSecond) {
        //Constructors are not inherited. 
        //The child class (i.e. Arrow) should invoke a constructor
        //of the parent class (i.e. Line) in order for the instantiation 
        //process to function properly 
        //(the Java compiler checks and verifies this happens).
        
        //Here, since we cannot access the Line x, y fields (they are private),
        //we can only call the Line(x, y) constructor to initialize the Line
        super(p1, p2);
        this.fromFirstToSecond = fromFirstToSecond;
    }
    
    public boolean isDirectionFromFirstToSecond() {
        return fromFirstToSecond;
    }
    
    public void setDirectionFromFirstToSecond(boolean fromFirstToSecond) {
        this.fromFirstToSecond = fromFirstToSecond;
    }
    
    public void toggleDirection() {
        fromFirstToSecond = !fromFirstToSecond;
    }
    
}
