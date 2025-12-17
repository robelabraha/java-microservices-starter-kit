package com.micro.order;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @GetMapping
    public String getOrders() {
        return "List of orders";
    }

    @PostMapping
    public String createOrder(@RequestBody String order) {
        return "Created order: " + order;
    }
}
