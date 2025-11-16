package com.skanda_practice.skanda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skanda_practice.skanda.dtoentity.PracticeDTO;
import com.skanda_practice.skanda.dtoentity.PracticeEntiry;
import com.skanda_practice.skanda.service.PracticeService;

@RestController
@RequestMapping("/api/orders")
public class PracticeController {
	@Autowired
    private PracticeService orderService;

    // Create order
    @PostMapping
    public PracticeEntiry createOrder(@RequestBody PracticeEntiry order) {
        return orderService.createOrder(order);
    }

    // Get all orders
    @GetMapping
    public List<PracticeDTO> getAllOrders() {
        return orderService.getAllOrders();
    }

    // Get orders by customer name
    @GetMapping("/customer/{customerName}")
    public List<PracticeDTO> getOrdersByCustomerName(@PathVariable String customerName) {
        return orderService.getOrdersByCustomerName(customerName);
    }

    // Get order by ID
    @GetMapping("/{id}")
    public PracticeDTO getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

}
