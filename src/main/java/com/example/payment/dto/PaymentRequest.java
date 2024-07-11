package com.example.payment.dto;

  import lombok.Data;

    @Data
    public class PaymentRequest {
        private String token;
        private int amount;
        private String currency;
    }
