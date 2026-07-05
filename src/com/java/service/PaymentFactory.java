package com.java.service;

import com.java.config.PaymentConfig;
import com.java.config.UpiPaymentConfig;
import com.java.enums.PaymentMode;
import com.java.strategy.payment.CashPaymentStrategy;
import com.java.strategy.payment.PaymentStrategy;
import com.java.strategy.payment.UPIPaymentStrategy;

public class PaymentFactory {
    
    public static PaymentStrategy getPaymentStartegy(PaymentMode mode, PaymentConfig config) {
        
        return switch(mode) {
            case UPI ->  new UPIPaymentStrategy(((UpiPaymentConfig)config).getUpiId());
            case CASH -> new CashPaymentStrategy();
        };
    }
}
