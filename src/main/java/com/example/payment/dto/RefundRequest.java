package com.example.payment.dto;

import lombok.Data;

@Data
public class RefundRequest {
    private String transactionId;
    private int amount;
}

