package com.sales.demo.service;

import com.sales.demo.models.Customer;
import com.sales.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer findById(long id) {
        return customerRepository.findById(id);
    }

    public List<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }

    public Customer findByEmail(String email) {
        return customerRepository.findByEmail(email);
    }

    public List<Customer> findByPhoneNumber(String phoneNumber) {
        return customerRepository.findByPhoneNumber(phoneNumber);
    }

    public List<Customer> findByAddress(String address) {
        return customerRepository.findByAddress(address);
    }

    public List<Customer> findByCity(String city) {
        return customerRepository.findByCity(city);
    }

    public List<Customer> findByState(String state) {
        return customerRepository.findByState(state);
    }

    public List<Customer> findByZipCode(String zipCode) {
        return customerRepository.findByZipCode(zipCode);
    }

    public Customer findBySsn(String ssn) {
        return customerRepository.findBySsn(ssn);
    }

    public Customer findByDriversLicenseNumber(String driversLicenseNumber) {
        return customerRepository.findByDriversLicenseNumber(driversLicenseNumber);
    }

    public Customer findByPassportNumber(String passportNumber) {
        return customerRepository.findByPassportNumber(passportNumber);
    }

    public List<Customer> findByCreditScoreGreaterThan(int creditScore) {
        return customerRepository.findByCreditScoreGreaterThan(creditScore);
    }

    public List<Customer> findByIncomeGreaterThan(double income) {
        return customerRepository.findByIncomeGreaterThan(income);
    }

    public List<Customer> findByLoanAmountGreaterThan(double loanAmount) {
        return customerRepository.findByLoanAmountGreaterThan(loanAmount);
    }

    public List<Customer> findByLoanTerm(int loanTerm) {
        return customerRepository.findByLoanTerm(loanTerm);
    }

    public List<Customer> findByVehicleMake(String vehicleMake) {
        return customerRepository.findByVehicleMake(vehicleMake);
    }

    public List<Customer> findByVehicleModel(String vehicleModel) {
        return customerRepository.findByVehicleModel(vehicleModel);
    }

    public List<Customer> findByVehicleYear(int vehicleYear) {
        return customerRepository.findByVehicleYear(vehicleYear);
    }

    public List<Customer> findByVehicleMileage(int vehicleMileage) {
        return customerRepository.findByVehicleMileage(vehicleMileage);
    }

    public List<Customer> findByVehiclePrice(double vehiclePrice) {
        return customerRepository.findByVehiclePrice(vehiclePrice);
    }

    public List<Customer> findByLoanStatus(String loanStatus) {
        return customerRepository.findByLoanStatus(loanStatus);
    }

    public List<Customer> findByLoanDisbursementStatus(String loanDisbursementStatus) {
        return customerRepository.findByLoanDisbursementStatus(loanDisbursementStatus);
    }

    public List<Customer> findByLoanApprovalStatus(String loanApprovalStatus) {
        return customerRepository.findByLoanApprovalStatus(loanApprovalStatus);
    }

    public List<Customer> findByPreQualificationStatus(String preQualificationStatus) {
        return customerRepository.findByPreQualificationStatus(preQualificationStatus);
    }

    // Add additional business methods and logic for the mortgage loan process

}

