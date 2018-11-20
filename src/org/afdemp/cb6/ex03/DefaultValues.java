package org.afdemp.cb6.ex03;

public class DefaultValues {

    //Java assigns default values to all the member fields
    //of a class
    
    //Statics
    private static final String CONSTANT = "I don't change";
    static int si;
    static String ss;

    //Primitives
    private int i;
    private double d;
    private boolean b;
    private char c;

    //Classes / references
    String s;
    
    public int getI() {
        return i;
    }
    
    public void setI(int i) {
        this.i = i;
    }
    
    public int calcMagic() {
        return si + i;
    }
    
    public String getMessage() {
        return CONSTANT + s;
    }

    @Override
    public String toString() {
        return "i=" + i + "\n" +
               "d=" + d + "\n" +
               "b=" + b + "\n" +
               "c=" + c + "\n" +
               "s=" + s;
    }
}
