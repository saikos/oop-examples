package org.afdemp.cb6.ex06;

/**
 *
 * @author saiko
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println(
            ClassWithInnerClasses.LONG_CONSTANT
        );
        
        System.out.println(
            ClassWithInnerClasses.Constants.STRING_CONSTANT
        );
        
        new ClassWithInnerClasses.Constants(3);
        
        ClassWithInnerClasses cwic = 
                new ClassWithInnerClasses("test");
        
        
        cwic.new Inner(4l);
    }
}
