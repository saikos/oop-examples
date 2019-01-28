package org.afdemp.cb6.ex09;

import java.util.Arrays;
import java.util.Comparator;
import org.afdemp.cb6.ex02.Printer;
import org.afdemp.cb6.ex02.PrinterNotEnabledException;
import org.afdemp.cb6.ex03.calc.ArithmeticCalculation;

/*
 Examples of anonymous inner classes.
*/
public class Main {

    public static void main(String[] args) {
        
        String[] names = new String[]{
            "Tom",
            "John",
            "Robert"
        };
                
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int l1 = s1.length();
                int l2 = s2.length();
                
                if (l1 < l2) {
                    return -1;
                }
                
                if (l1 > l2) {
                    return 1;
                }
                
                return 0;                
            }
            
        });
        
        System.out.println(Arrays.asList(names));               
       
        
        ArithmeticCalculation mult = 
                new ArithmeticCalculation("Mult", 1.0, 2.0) {
                    
                    double z = 3.0;
                    
                    @Override
                    public double calculate() {
                        return x * y;
                    }
                };
        System.out.println(mult.getName());
        System.out.println(mult.calculate());
        
        Printer p = new Printer() {
            @Override
            public void print(String message) throws PrinterNotEnabledException {
                throw new PrinterNotEnabledException("NOT");
            }            
        };
        p.print("Koukou");                
        
        
    }
    
}
