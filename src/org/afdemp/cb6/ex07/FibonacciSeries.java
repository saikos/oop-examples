package org.afdemp.cb6.ex07;

import java.util.Objects;

public class FibonacciSeries implements NumericComputation<Long> {
    
    private final int n;

    private FibonacciSeries(int nth) {
        this.n = nth;
    }            

    @Override
    public Long compute() {
        long[] lastTwo = new long[] {0l, 1l};
        
        if (n < 3) {
            return lastTwo[n - 1];
        }
        
        for (int i = 2; i < n; i++) {
            long beforeLast = lastTwo[0];
            long last = lastTwo[1];
            lastTwo[0] = last;
            lastTwo[1] = beforeLast + last;
        }
        return lastTwo[1];
    }
    
    public static FibonacciSeries nthElement(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n should be > 0");
        }
        else {
            return new FibonacciSeries(n);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (this == object) return true;
        if (!(object instanceof FibonacciSeries)) return false;
        
        FibonacciSeries other = (FibonacciSeries) object;
        return (this.n == other.n);                
    }
    
    @Override
    public int hashCode() {
        return Objects.hashCode(n);
    }

    @Override
    public String toString() {
        return "FibonacciSeries[" + n + "]";
    }
    
    
}
