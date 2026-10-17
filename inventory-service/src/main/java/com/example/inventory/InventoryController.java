package com.example.inventory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @GetMapping("/inventory/items")
    public String getInventory() {
        return """
            {
              "service": "Inventory Service",
              "items": ["Laptop", "Mouse", "Keyboard"],
              "status": "success"
            }
            """;
    }
}