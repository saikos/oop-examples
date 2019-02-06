package org.afdemp.cb6.ex10;

public class Threading {
    
    public static void main(String[] args) throws InterruptedException {
        
        Runnable r = new Runnable() {
            
            @Override
            public void run() {
                long i = 0l;            
                while(true) {
                    if (i % 1000 == 0) {
                        System.out.println("i=" + i);
                    }
                    i++;
                }
            }
        };
            
        System.out.println("Starting a new thread");
        Thread t = new Thread(r);
        t.setDaemon(true);
        t.start();
        System.out.println("Sleeping for a sec");
        Thread.sleep(1000);
        System.out.println("Back in business");
        
        System.out.println("Nothing to do, bye!");
    }
}
