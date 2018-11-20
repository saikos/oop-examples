package org.afdemp.cb6.ex03;

import org.afdemp.cb6.ex03.calc.ArithmeticCalculation;
import org.afdemp.cb6.ex03.calc.Sub;
import org.afdemp.cb6.ex03.calc.Sum;
import org.afdemp.cb6.ex03.geom.Arrow;
import org.afdemp.cb6.ex03.geom.Circle;
import org.afdemp.cb6.ex03.geom.Line;
import org.afdemp.cb6.ex03.geom.Point;
import org.afdemp.cb6.ex03.geom.Rectangle;
import org.afdemp.cb6.ex03.geom.Shape;
import org.afdemp.cb6.ex03.geom.Square;

public class Main {

    public static void main(String[] args) {
        
        //Default values        
        //demoDefaultValues();                
        
        //Shadowing        
        //demoShadowing();
        
                
        //Line, point, method overloading                
        //demoMethodOverloading();
        
        //Type polymorphism (X is-a Y)         
        //demoIsA();
                               
        //Interfaces and abstract classes         
        //demoAbstractClasses();
        demoInterfaces();
        
        /*
        //Down-casting
        demoDownCasting();
        */
    }
    
    private static void demoDefaultValues() {
        System.out.println("si=" + DefaultValues.si);
        System.out.println("ss=" + DefaultValues.ss);               

        DefaultValues dv = new DefaultValues();        
        dv.s = "Foofootos";
        dv.setI(32);
        
        DefaultValues.si = 11;
        
        System.out.println(dv.calcMagic());
        System.out.println(dv.toString());
        System.out.println("si=" + DefaultValues.si);
        System.out.println("ss=" + DefaultValues.ss);               
               
        DefaultValues dv2 = new DefaultValues();
        dv2.s = "Bouboukos";
        System.out.println("The 2nd DV object:");
        System.out.println(dv2.toString());
        
        System.out.println(dv2.calcMagic());
        DefaultValues.si++;
        System.out.println(dv2.calcMagic());
        
        System.out.println("si=" + DefaultValues.si);
        System.out.println("ss=" + DefaultValues.ss);                 
        
    }
    
    private static void demoShadowing() {
        
        //Name collisions:
        // - method parameters vs class members
        // - local variables vs class members        
        Shadowing sh = new Shadowing(0);
        sh.findTheAnswer();
        System.out.println(sh.getAnswer());
        
        Shadowing sh2 = new Shadowing(42);
        sh2.findTheAnswer();
        System.out.println(sh2.getAnswer());
                
        //Also, imported class vs class-at-hand
        System.out.println("Calling ex01 main...");
        org.afdemp.cb6.ex01.Main.main(null);        
        System.out.println("Done with ex01!");        
        
    }
    
    private static void demoMethodOverloading() {
        MethodOverloading mo = new MethodOverloading();
        Point p1 = new Point(0, 1);
        Point p2 = new Point(0, 2);
        Line l1 = new Line(p1, p2);
        mo.drawLine(p1, p2);
        mo.drawLine(l1);        
    }
    
    private static void demoIsA() {
        MethodOverloading mo = new MethodOverloading();
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 1);
        
        Arrow a = new Arrow(p1, p2, false);
        System.out.println("a is-a Arrow (obviously): " + (a instanceof Arrow));        
        System.out.println("a is-a Line  (too)      : " + (a instanceof Line));
        
        //Since a is-a Line, we can pass it to any method expecting
        //a Line
        mo.drawLine(a);
        
        //And we can also assign it to a Line variable (upcasting)
        Line l2 = new Arrow(p1, p2, true);
        System.out.println("l2 is-a Arrow: " + (l2 instanceof Arrow));        
        System.out.println("l2 is-a Line : " + (l2 instanceof Line));
                
        if (l2 instanceof Arrow) {
            Arrow a2 = (Arrow)l2;
            a2.isDirectionFromFirstToSecond();
        }
    }
    
    private static void demoAbstractClasses() {
        double first  = 2.0;
        double second = 1.0;
        Sum sum = new Sum(first, second);
        System.out.println(sum.getName() + "(" + first + "," + second + ")=" + sum.calculate());    
        Sub sub = new Sub(first, second);
        System.out.println(sub.getName() + "(" + first + "," + second + ")=" + sub.calculate());    
    }
    
    private static void demoInterfaces() {
        Point startingPoint = new Point(0, 0);
        Circle c = new Circle(startingPoint, 1.0);
        //System.out.println("c area     : " + c.getArea());        
        //System.out.println("c perimeter: " + c.getPerimeter());        
        
        Rectangle r = new Rectangle(startingPoint, 1.0, 1.0);
        //System.out.println("r area     : " + r.getArea());        
        //System.out.println("r perimeter: " + r.getPerimeter());        
        
        Square s = new Square(startingPoint, 1.0);
        
        //But wait, aren't they both shapes?
        printShape(c);
        printShape(r);
        printShape(s);
                
    }
    
    private static void printShape(Shape s) {
        System.out.println(s.getName() + " area     : " + s.getArea());        
        System.out.println(s.getName() + " perimeter: " + s.getPerimeter());        
    }
    
    private static void demoDownCasting() {        
        ArithmeticCalculation[] calcs = new ArithmeticCalculation[3];
        calcs[0] = new Sub(1.0, 0.0);
        calcs[1] = new Sum(0.0, 0.0);
        calcs[2] = new Sub(2.0, 3.0);
        
        int countOfSums = 0;
        int countOfSubs = 0;
        
        for (ArithmeticCalculation calc: calcs) {
            if (calc instanceof Sum) {
                countOfSums++;
                Sum sum = (Sum) calc;
                sum.extraMethodOfSum();
            }
            else if (calc instanceof Sub) {
                countOfSubs++;
                Sub sub = (Sub) calc;
                sub.extraMethodOfSub();
            }
            else {
                System.out.println("Ignoring " + calc.getName());
            }
        }
        
        System.out.println("# of Sum objects: " + countOfSums);
        System.out.println("# of Sub objects: " + countOfSubs);
    }

}
