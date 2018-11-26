package org.afdemp.cb6.ex06;

public class ClassWithInnerClasses {
    
    public static final long LONG_CONSTANT = 33l;
    
    String name;
    
    public ClassWithInnerClasses(String name) {
        this.name = name;
    }
    
    public static class Constants {
                
        public static final String STRING_CONSTANT  = "constant";
        public static final int    INTEGER_CONSTANT = 42;
        
        int integer;
        
        public Constants(int integer) {
            this.integer = integer;
        }
    }
    
    public class Inner {
        
        long num;
        
        public Inner(long num) {
            this.num = num;
        }
    }
    
}
