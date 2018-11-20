package org.afdemp.cb6.ex03.calc;

public class Sum extends ArithmeticCalculation {
    
    public Sum(double x, double y) {
        super("sum", x, y);
    }

    @Override
    public double calculate() {
        return x + y;
    }
    
    public void extraMethodOfSum() {
        System.out.println("I am an extra method of the Sum type");
    }
}
