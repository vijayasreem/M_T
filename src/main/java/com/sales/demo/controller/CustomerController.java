
package com.sales.demo.controller;

import com.sales.demo.model.Customer;
import com.sales.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/good-credit")
    public ResponseEntity<List<Customer>> getCustomersWithGoodCredit() {
        List<Customer> customers = customerService.findCustomersWithGoodCredit();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/questionable-credit")
    public ResponseEntity<List<Customer>> getCustomersWithQuestionableCredit() {
        List<Customer> customers = customerService.findCustomersWithQuestionableCredit();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/bad-credit")
    public ResponseEntity<List<Customer>> getCustomersWithBadCredit() {
        List<Customer> customers = customerService.findCustomersWithBadCredit();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }
}
