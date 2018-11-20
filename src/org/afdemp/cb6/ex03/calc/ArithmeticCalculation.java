package org.afdemp.cb6.ex03.calc;

/* 
 * An arithmetic calculation applied on two numbers.
*/
public abstract class ArithmeticCalculation {
    
    //We declare the x,y numbers as protected in order to enable
    //subclasses to access them directly. Since we provide
    //no getters (e.g. getX()), only subclasses can perform
    //the actual calculation.
    //We have also declared them final for safe-guarding the calculation:
    //we don't allow neither x nor y to change during a calculation, or 
    //afterwards. That's why we don't provide any setters (e.g. setX()).    
    protected final double x;
    protected final double y;    
    
    //We also hold a String for the name of the calculation, which is
    //final (never changes) and provided at construction time.
    private final String name;
    
    public ArithmeticCalculation(String name, double x, double y) {
        this.name = name;
        this.x    = x;
        this.y    = y;
    }
    
    
    public String getName() {
        return name;
    }
    
    public abstract double calculate();
    
}
