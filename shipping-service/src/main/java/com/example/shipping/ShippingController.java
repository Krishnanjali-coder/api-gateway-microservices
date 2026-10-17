package com.example.shipping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShippingController {

    @GetMapping("/shipping/orders")
    public String getShipping() {
        return """
            {
              "service": "Shipping Service",
              "orders": ["ORD101", "ORD102"],
              "status": "success"
            }
            """;
    }
}