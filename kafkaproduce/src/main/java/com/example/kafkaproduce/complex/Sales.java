package com.example.kafkaproduce.complex;

public class Sales {
    private long salesId;
    private String customerName;
    private double totalAmount;

    public Sales(long salesId, String customerName, double totalAmount) {
        this.salesId = salesId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }

    public Sales() {
    }

    public long getSalesId() {
        return salesId;
    }

    public void setSalesId(long salesId) {
        this.salesId = salesId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
