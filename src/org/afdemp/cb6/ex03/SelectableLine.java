package org.afdemp.cb6.ex03;

import org.afdemp.cb6.ex03.geom.Line;
import org.afdemp.cb6.ex03.geom.Point;

/**
 *
 * @author saiko
 */
class SelectableLine extends Line{

    private boolean isSelected;
    
    public SelectableLine(Point first, Point second, boolean selected) {
        super(first, second);
        this.isSelected = selected;
    }

    public boolean isIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }
    
    
}
