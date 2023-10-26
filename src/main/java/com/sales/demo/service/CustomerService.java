
package com.sales.demo.service;

import com.sales.demo.model.Customer;
import com.sales.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findCustomersWithGoodCredit() {
        return customerRepository.findCustomersWithGoodCredit();
    }

    public List<Customer> findCustomersWithQuestionableCredit() {
        return customerRepository.findCustomersWithQuestionableCredit();
    }

    public List<Customer> findCustomersWithBadCredit() {
        return customerRepository.findCustomersWithBadCredit();
    }
}
