package com.example.payment.service;

import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

    @Service
    public class StripeService {

        public Charge createCharge(String token, double amount) throws StripeException {
            Map<String, Object> chargeParams = new HashMap<>();
            chargeParams.put("amount", (int) (amount * 100)); // Amount in pence
            chargeParams.put("currency", "gbp");
            chargeParams.put("source", token);
            chargeParams.put("description", "Charge for payment");

            return Charge.create(chargeParams);
        }
    }




