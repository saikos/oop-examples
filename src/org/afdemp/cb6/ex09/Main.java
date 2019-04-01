package org.afdemp.cb6.ex09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.afdemp.cb6.ex02.Printer;
import org.afdemp.cb6.ex02.PrinterNotEnabledException;
import org.afdemp.cb6.ex03.calc.ArithmeticCalculation;

/*
 Examples of anonymous inner classes, lambdas and streams.
*/
public class Main {
        
    public static void main(String[] args) {    
        String[] names = new String[]{
            "Tom",
            "John",
            "Robert"
        };
        
        Arrays.sort(names, (String s1, String s2) -> {
            int l1 = s1.length();
            int l2 = s2.length();

            if (l1 < l2) {
                return -1;
            }

            if (l1 > l2) {
                return 1;
            }

            return 0;                
        });
                
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
       
        streamExampleOld();
        streamExample();    
        
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
    
    public static void streamExample() {
        List<String> newList = Stream.of("Cake", "Alpha", "Beta", "Coco", "Dear").                
                filter( s -> s.startsWith("C") ).
                map(s -> s.toLowerCase()).
                collect(Collectors.toList());
        System.out.println(newList);
    }

    
    public static void streamExampleOld() {
        List<String> strings = Arrays.asList("A", "B", "C", "D");
        System.out.println(
            allItemsToLowerCase(
                allItemsStartingWith("C", strings)
            )
        );        
    }    
    
    public static List<String> allItemsStartingWith(String prefix, List<String> list) {
        List<String> newList = new ArrayList<>();
        for(String s: list) {
            if (s.startsWith(prefix)) {
                newList.add(s);
            }
        }
        return newList;
    }
    
    public static List<String> allItemsToLowerCase(List<String> list) {
        List<String> newList = new ArrayList<>();
        for(String s: list) {            
            newList.add(s.toLowerCase());            
        }
        return newList;
    }

    
}
