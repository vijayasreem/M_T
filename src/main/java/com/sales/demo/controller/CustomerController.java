
package com.sales.demo.controller;

import com.sales.demo.models.Customer;
import com.sales.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable long id) {
        return customerService.findById(id);
    }

    @GetMapping("/name/{name}")
    public List<Customer> getCustomersByName(@PathVariable String name) {
        return customerService.findByName(name);
    }

    @GetMapping("/email/{email}")
    public Customer getCustomerByEmail(@PathVariable String email) {
        return customerService.findByEmail(email);
    }

    @GetMapping("/phoneNumber/{phoneNumber}")
    public List<Customer> getCustomersByPhoneNumber(@PathVariable String phoneNumber) {
        return customerService.findByPhoneNumber(phoneNumber);
    }

    @GetMapping("/address/{address}")
    public List<Customer> getCustomersByAddress(@PathVariable String address) {
        return customerService.findByAddress(address);
    }

    @GetMapping("/city/{city}")
    public List<Customer> getCustomersByCity(@PathVariable String city) {
        return customerService.findByCity(city);
    }

    @GetMapping("/state/{state}")
    public List<Customer> getCustomersByState(@PathVariable String state) {
        return customerService.findByState(state);
    }

    @GetMapping("/zipCode/{zipCode}")
    public List<Customer> getCustomersByZipCode(@PathVariable String zipCode) {
        return customerService.findByZipCode(zipCode);
    }

    @GetMapping("/ssn/{ssn}")
    public Customer getCustomerBySsn(@PathVariable String ssn) {
        return customerService.findBySsn(ssn);
    }

    @GetMapping("/driversLicenseNumber/{driversLicenseNumber}")
    public Customer getCustomerByDriversLicenseNumber(@PathVariable String driversLicenseNumber) {
        return customerService.findByDriversLicenseNumber(driversLicenseNumber);
    }

    @GetMapping("/passportNumber/{passportNumber}")
    public Customer getCustomerByPassportNumber(@PathVariable String passportNumber) {
        return customerService.findByPassportNumber(passportNumber);
    }

    @GetMapping("/creditScore/{creditScore}")
    public List<Customer> getCustomersByCreditScoreGreaterThan(@PathVariable int creditScore) {
        return customerService.findByCreditScoreGreaterThan(creditScore);
    }

    @GetMapping("/income/{income}")
    public List<Customer> getCustomersByIncomeGreaterThan(@PathVariable double income) {
        return customerService.findByIncomeGreaterThan(income);
    }

    @GetMapping("/loanAmount/{loanAmount}")
    public List<Customer> getCustomersByLoanAmountGreaterThan(@PathVariable double loanAmount) {
        return customerService.findByLoanAmountGreaterThan(loanAmount);
    }

    @GetMapping("/loanTerm/{loanTerm}")
    public List<Customer> getCustomersByLoanTerm(@PathVariable int loanTerm) {
        return customerService.findByLoanTerm(loanTerm);
    }

    @GetMapping("/vehicleMake/{vehicleMake}")
    public List<Customer> getCustomersByVehicleMake(@PathVariable String vehicleMake) {
        return customerService.findByVehicleMake(vehicleMake);
    }

    @GetMapping("/vehicleModel/{vehicleModel}")
    public List<Customer> getCustomersByVehicleModel(@PathVariable String vehicleModel) {
        return customerService.findByVehicleModel(vehicleModel);
    }

    @GetMapping("/vehicleYear/{vehicleYear}")
    public List<Customer> getCustomersByVehicleYear(@PathVariable int vehicleYear) {
        return customerService.findByVehicleYear(vehicleYear);
    }

    @GetMapping("/vehicleMileage/{vehicleMileage}")
    public List<Customer> getCustomersByVehicleMileage(@PathVariable int vehicleMileage) {
        return customerService.findByVehicleMileage(vehicleMileage);
    }

    @GetMapping("/vehiclePrice/{vehiclePrice}")
    public List<Customer> getCustomersByVehiclePrice(@PathVariable double vehiclePrice) {
        return customerService.findByVehiclePrice(vehiclePrice);
    }

    @GetMapping("/loanStatus/{loanStatus}")
    public List<Customer> getCustomersByLoanStatus(@PathVariable String loanStatus) {
        return customerService.findByLoanStatus(loanStatus);
    }

    @GetMapping("/loanDisbursementStatus/{loanDisbursementStatus}")
    public List<Customer> getCustomersByLoanDisbursementStatus(@PathVariable String loanDisbursementStatus) {
        return customerService.findByLoanDisbursementStatus(loanDisbursementStatus);
    }

    @GetMapping("/loanApprovalStatus/{loanApprovalStatus}")
    public List<Customer> getCustomersByLoanApprovalStatus(@PathVariable String loanApprovalStatus) {
        return customerService.findByLoanApprovalStatus(loanApprovalStatus);
    }

    @GetMapping("/preQualificationStatus/{preQualificationStatus}")
    public List<Customer> getCustomersByPreQualificationStatus(@PathVariable String preQualificationStatus) {
        return customerService.findByPreQualificationStatus(preQualificationStatus);
    }

    // Add additional endpoints and business methods for the mortgage loan process

    @PostMapping("/")
    public Customer createCustomer(@RequestBody Customer customer) {
        // Add logic to create a new customer
        return customerService.createCustomer(customer);
    }

    @PutMapping("/")
    public Customer updateCustomer(@RequestBody Customer customer) {
        // Add logic to update an existing customer
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable long id) {
        // Add logic to delete a customer by id
        customerService.deleteCustomer(id);
    }
}
