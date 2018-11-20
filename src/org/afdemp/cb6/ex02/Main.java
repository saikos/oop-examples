package org.afdemp.cb6.ex02;

public class Main {

    public static void main(String[] args) {

        String message = "MSG";

        Printer p1 = new Printer();
        p1.print(message);

        SuperPrinter sp1 = new SuperPrinter();
        sp1.print(message);

        SuperPrinter sp2 = new SuperPrinter(false);
        sp2.print(message);
    }

}
