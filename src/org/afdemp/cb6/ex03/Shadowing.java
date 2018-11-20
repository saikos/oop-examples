package org.afdemp.cb6.ex03;

public class Shadowing {
    
    private int num; //num is a member field
    
    public Shadowing(int num) { 
        //num is defined as a constructor/method parameter
        this.num = num;
    }    
    
    public void findTheAnswer() {
        //num is defined as a local variable
        int num = 42;
        if (this.num != num) {
            System.out.println(this.num + " is not the answer.");
        }
        System.out.println(num + " is the answer!");
        this.num = num;
    }       
    
    
    public int getAnswer() {
        return num;
    }
    
}
