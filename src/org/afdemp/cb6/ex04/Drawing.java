package org.afdemp.cb6.ex04;

import java.util.List;
import java.util.ArrayList;
import org.afdemp.cb6.ex03.geom.Line;

public abstract class Drawing {
    
    protected List<Line> lines = new ArrayList<>();
     
    abstract Line addLine(int x1, int x2, int y);
    
    abstract void selectLine(Line line);
    
    abstract void alignSelectedLinesToTheLeft();
    
    abstract void alignSelectedLinesToTheRight();
    
}
