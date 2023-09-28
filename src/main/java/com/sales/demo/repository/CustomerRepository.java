
package com.sales.demo.repository;

import com.sales.demo.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // Query to retrieve customer information by ID
    Customer findById(long id);
    
    // Query to retrieve customer information by name
    List<Customer> findByName(String name);
    
    // Query to retrieve customer information by email
    Customer findByEmail(String email);
    
    // Query to retrieve customer information by phone number
    List<Customer> findByPhoneNumber(String phoneNumber);
    
    // Query to retrieve customer information by address
    List<Customer> findByAddress(String address);
    
    // Query to retrieve customer information by city
    List<Customer> findByCity(String city);
    
    // Query to retrieve customer information by state
    List<Customer> findByState(String state);
    
    // Query to retrieve customer information by zip code
    List<Customer> findByZipCode(String zipCode);
    
    // Query to retrieve customer information by SSN (Social Security Number)
    Customer findBySsn(String ssn);
    
    // Query to retrieve customer information by driver's license number
    Customer findByDriversLicenseNumber(String driversLicenseNumber);
    
    // Query to retrieve customer information by passport number
    Customer findByPassportNumber(String passportNumber);
    
    // Query to retrieve customer information by credit score
    List<Customer> findByCreditScoreGreaterThan(int creditScore);
    
    // Query to retrieve customer information by income
    List<Customer> findByIncomeGreaterThan(double income);
    
    // Query to retrieve customer information by loan amount
    List<Customer> findByLoanAmountGreaterThan(double loanAmount);
    
    // Query to retrieve customer information by loan term
    List<Customer> findByLoanTerm(int loanTerm);
    
    // Query to retrieve customer information by vehicle make
    List<Customer> findByVehicleMake(String vehicleMake);
    
    // Query to retrieve customer information by vehicle model
    List<Customer> findByVehicleModel(String vehicleModel);
    
    // Query to retrieve customer information by vehicle year
    List<Customer> findByVehicleYear(int vehicleYear);
    
    // Query to retrieve customer information by vehicle mileage
    List<Customer> findByVehicleMileage(int vehicleMileage);
    
    // Query to retrieve customer information by vehicle price
    List<Customer> findByVehiclePrice(double vehiclePrice);
    
    // Query to retrieve customer information by loan status
    List<Customer> findByLoanStatus(String loanStatus);
    
    // Query to retrieve customer information by loan disbursement status
    List<Customer> findByLoanDisbursementStatus(String loanDisbursementStatus);
    
    // Query to retrieve customer information by loan approval status
    List<Customer> findByLoanApprovalStatus(String loanApprovalStatus);
    
    // Query to retrieve customer information by pre-qualification status
    List<Customer> findByPreQualificationStatus(String preQualificationStatus);

}
