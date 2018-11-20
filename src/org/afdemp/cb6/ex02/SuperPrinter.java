package org.afdemp.cb6.ex02;

public class SuperPrinter extends Printer {
    
    private boolean enabled;

    public SuperPrinter() {
        this(true);
    }

    public SuperPrinter(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public void print(String message) {
        if (enabled) {
            super.print(message);
        }
        else {
            throw new RuntimeException("The printer is not enabled");
        }
    }
}
