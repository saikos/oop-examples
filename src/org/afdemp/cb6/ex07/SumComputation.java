package org.afdemp.cb6.ex07;

import java.util.Objects;
import org.afdemp.cb6.ex03.calc.Sum;

public class SumComputation 
       extends Sum 
       implements NumericComputation<Double> {

    public SumComputation(double x, double y) {
        super(x, y);
    }

    @Override
    public Double compute() {
        return calculate();
    }    

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (this == object) return true;
        if (!(object instanceof SumComputation)) return false;
        
        SumComputation other = (SumComputation) object;
        return (this.x == other.x && this.y == other.y);                
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return x + "+" + y;
    }       
}
