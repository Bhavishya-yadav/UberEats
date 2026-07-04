package com.java.payment;
public interface PaymentStrategy {
    
    public Payment processPayment(String orderId, int amount);
}
/*
Factory {
    switch (type ) {
        type == "UPI"
            new UPIStrategy()
    }
}

PaymentManager {

    processPayment(String upi, String orderId, String amount) {

        upiStrategy = factory.getStartegy(upi);
        upiStategy.pay()
    }
}

UPISTartegy {
    pay() {
    Paymennew payment(orderId, amount, UPI);
    sout("upi ")
    payment.setStatus(SUCEESS)
}
}

CODStategy {
    payment.setStatus()
}


*/