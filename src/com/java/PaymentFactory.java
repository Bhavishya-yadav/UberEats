package com.java;

public class PaymentFactory {
    
    public static PaymentStrategy getPaymentStartegy(PaymentMode mode, PaymentConfig config) {
        
        return switch(mode) {
            case UPI ->  new UPIPaymentStrategy(((UpiPaymentConfig)config).getUpiId());
            case CASH -> new CashPaymentStrategy();
        };
    }
}
