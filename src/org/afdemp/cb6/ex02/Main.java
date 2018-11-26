package org.afdemp.cb6.ex02;

public class Main {

    public static void main(String[] args) {

        try {
            String message = "MSG";
            printMessage(message);      
            
            //invoke some other method with a checked exception
        }
        catch(PrinterNotEnabledException e) {
            System.out.println("Error! " + e.getMessage());
        }        
        
        System.out.println("I 'm still Alive!");
    }
    
    static void printMessage(String message) throws PrinterNotEnabledException {
        Printer p1 = new Printer();
        p1.print(message);

        SuperPrinter sp1 = new SuperPrinter(false);
        sp1.print(message);

        SuperPrinter sp2 = new SuperPrinter();
        sp2.print(message);
    }
}
