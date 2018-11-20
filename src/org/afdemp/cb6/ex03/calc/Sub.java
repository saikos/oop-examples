package org.afdemp.cb6.ex03.calc;

public class Sub extends ArithmeticCalculation {
    
    public Sub(double x, double y) {
        super("Sub", x, y);
    }

    @Override
    public double calculate() {
        return x - y;
    }
    
    public void extraMethodOfSub() {
        System.out.println("I am an extra method of the Sub type");
    }
    
}
