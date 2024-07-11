package com.example.payment.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

    @SpringJUnitConfig(StripeConfig.class)
    public class StripeConfigTest {

        @Value("${stripe.api.key}")
        private String stripeApiKey;

        @Test
        public void testStripeApiKey() {
            assertNotNull(stripeApiKey);
            assertFalse(stripeApiKey.isEmpty());
        }
    }


