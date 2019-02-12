package org.afdemp.cb6.ex10;

public class ConcurrentModification {
    
    private static int counter = 0;
    
    public static void main(String[] args) {                
        
        Runnable r = new Runnable() {
            @Override
            public void run() {
                long id = Thread.currentThread().getId();
                while(!Thread.currentThread().isInterrupted()) {
                    counter++;
                    System.out.println(id + " has set " + counter);
                }
            }            
        }
        
        try {
            Thread t1 = new Thread(r);
            Thread t2 = new Thread(r);

            t2.start();
            t1.start();
        
            Thread.sleep(100l);
            
            t1.interrupt();
            t2.interrupt();
            
            System.out.println(counter);
        }
        catch(InterruptedException ie) {
            System.out.println("Interrupted while sleeping");
        }
    }
    
}
