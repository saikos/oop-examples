package org.afdemp.cb6.ex08;

public class Payment {
    
    public static final int STATUS_PENDING = 0;
    public static final int STATUS_OK      = 1;
    public static final int STATUS_ERROR   = -1;
    
    private int status;
    
    Payment(int status) {
        this.status = status;
    }
    
    public int getStatus() {
        return status;
    }
    
    pubic void setStatus(int status) {
        this.status = status;
    }
    
}
