package org.afdemp.cb6.ex08;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("You need to provide a status");
            System.exit(-1);
        }
        
        String statusAsString = args[0];
        
        try {
            PaymentStatus status = Enum.valueOf(PaymentStatus.class, statusAsString);
            System.out.println("Valid status: " + status.name() + " - " + status.ordinal());
            System.exit(0);
        }
        catch(Exception e) {
            System.out.println("Invalid status: " + statusAsString);
            System.out.println("Valid values are: ");
            for(PaymentStatus status : PaymentStatus.values()) {
                System.out.println(status.name());
            }
            System.exit(-1);
        }
        
        
    }
}
