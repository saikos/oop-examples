package org.afdemp.cb6.ex04;

import org.afdemp.cb6.ex03.geom.Line;

public class DrawingMain {

    public static void main(String[] args) {
        
        Drawing d = new MyDrawing();       
        
        Line l1 = d.addLine(0, 7, 10);
        Line l2 = d.addLine(0, 4, 11);
        Line l3 = d.addLine(11, 0, 20);
        Line l4 = d.addLine(5, 6, 7);
        Line l5 = d.addLine(7, 8, 9);
        Line l6 = d.addLine(9, 8, 7);
        Line l7 = d.addLine(0, 1, 0);
        Line l8 = d.addLine(3, 6, 9);
        
        d.selectLine(l1);
        d.selectLine(l3);
        d.selectLine(l5);
        d.selectLine(l7);
        
        d.alignSelectedLinesToTheLeft();
        
        /*
        d.selectLine(l2);
        d.selectLine(l4);
        d.selectLine(l6);
        d.selectLine(l8);
        
        d.alignSelectedLinesToTheRight();
        */
        
    }
    
}
