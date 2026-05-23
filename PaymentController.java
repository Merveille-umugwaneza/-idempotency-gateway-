package com.example.idempotencygateway.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentHashMap;

@RestController
public class PaymentController {

    private final ConcurrentHashMap<String, String> processedRequests = new ConcurrentHashMap<>();

    @GetMapping("/ping")
    public String ping() {
        return "Idempotency Gateway is running!";
    }

    @PostMapping("/process-payment")
    public String processPayment(@RequestHeader("Idempotency-Key") String key,
                                 @RequestBody PaymentRequest request) {
        return processedRequests.computeIfAbsent(key,
                k -> "Charged " + request.getAmount() + " " + request.getCurrency());
    }
}
