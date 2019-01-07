package org.afdemp.cb6.ex08;

public class PaymentUsingEnum {

    private PaymentStatus status;
    
    public PaymentUsingEnum(PaymentStatus status) {
        this.status = status;
    }
    
    public PaymentStatus getStatus() {
        return status;
    }
    
    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
