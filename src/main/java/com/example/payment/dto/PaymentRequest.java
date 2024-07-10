package com.example.payment.dto;

public class PaymentRequest {
    private String token;
    private double amount;

    public PaymentRequest() {
    }

    public PaymentRequest(String token, double amount) {
        this.token = token;
        this.amount = amount;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
