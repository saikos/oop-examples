package org.afdemp.cb6.ex03;

import org.afdemp.cb6.ex03.geom.Point;
import org.afdemp.cb6.ex03.geom.Line;

public class MethodOverloading {
    
    public void drawLine(Line l) {
        System.out.println("Drawing line: " + l);
        drawLine(l.getFirstPoint(), l.getSecondPoint());
    }
    
    public void drawLine(Point p1, Point p2) {
        System.out.println("Drawing line with points: " + p1 + ", " + p2);
        drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }
    
    public void drawLine(int x1, int y1, int x2, int y2) {        
        //The actual code for drawing the line should be realized
        //in a single place and should be parameterized by a specific
        //set of inputs
        
        //Method implementation goes here        
        System.out.println("(" + x1 + "," + y1 + ") - (" + x2 + "," + y2 +")");
    }
    
}
