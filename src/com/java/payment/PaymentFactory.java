package com.java.payment;

import com.java.payment.paymentConfig.PaymentConfig;
import com.java.payment.paymentConfig.UpiPaymentConfig;
import com.java.payment.paymentEnum.PaymentMode;
import com.java.payment.paymentStrategy.CashPaymentStrategy;
import com.java.payment.paymentStrategy.PaymentStrategy;
import com.java.payment.paymentStrategy.UPIPaymentStrategy;

public class PaymentFactory {
    
    public static PaymentStrategy getPaymentStartegy(PaymentMode mode, PaymentConfig config) {
        
        return switch(mode) {
            case UPI ->  new UPIPaymentStrategy(((UpiPaymentConfig)config).getUpiId());
            case CASH -> new CashPaymentStrategy();
        };
    }
}
