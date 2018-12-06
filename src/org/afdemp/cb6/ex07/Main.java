package org.afdemp.cb6.ex07;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    
    private static Map<NumericComputation<? extends Number>, Number> cache = new HashMap<>();
    
    public static void main(String[] args) {                                
        
        List<NumericComputation<? extends Number>> list;
        list = Arrays.asList(
            FibonacciSeries.nthElement(6),
            new SumComputation(1, 1)            
        );
        
        System.out.println(sum(list));
        
        Collections.reverse(list);
        
        System.out.println(sum(list));
    }
    
    private static Double sum(Collection<NumericComputation<? extends Number>> list) {
        double sum = 0.0;
        for(NumericComputation<? extends Number> c: list) {
            Number result;
            if (cache.containsKey(c)) {
                System.out.println("Using cached result: " + c);
                result = cache.get(c);
            }
            else {
                System.out.println("Computing result of: " + c);
                result = c.compute();
                cache.put(c, result);
            }
            sum = sum + result.doubleValue();
        }
        return sum;
    }
}
