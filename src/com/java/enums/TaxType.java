package com.java.enums;

public enum TaxType {
    CGST(2.5),
    SGST(2.5);

    double taxPercentage;
    TaxType(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

}
