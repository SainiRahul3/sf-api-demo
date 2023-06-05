package com.sf.demo.controller;


import com.sf.demo.Repository.CustomerRepository;
import com.sf.demo.model.Customer;
import com.sf.demo.model.CustomerOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sf.demo.Repository.OrderRepository;

import java.util.List;

@RestController
@RequestMapping("/api/private/customers/{customerId}/orders")
public class OrderController {

    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public OrderController(OrderRepository orderRepository, CustomerRepository customerRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
    }

    @GetMapping
    public ResponseEntity<List<CustomerOrder>> getAllOrdersForCustomer(@PathVariable("customerId") Long customerId) {
        List<CustomerOrder> orders = orderRepository.findOrdersByCustomerId(customerId);
        if (!orders.isEmpty()) {
            return ResponseEntity.ok(orders);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<CustomerOrder> createOrderForCustomer(@PathVariable("customerId") Long customerId,
            @RequestBody CustomerOrder order) {
        Customer customer = customerRepository.findById(customerId).orElse(null);
        if (customer != null) {
            order.setCustomer(customer);
            order.setOrderItems(order.getOrderItems());
            CustomerOrder savedOrder = orderRepository.save(order);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedOrder);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
