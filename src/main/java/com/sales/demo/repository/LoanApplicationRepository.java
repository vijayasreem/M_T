
package com.sales.demo.repository;

import com.sales.demo.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    // Custom queries
    // Example: Find loan applications by customer identification
    List<LoanApplication> findByCustomerId(String customerId);

    // Example: Find loan applications by application status
    List<LoanApplication> findByStatus(String status);

    // Example: Find loan applications by credit score greater than a given value
    List<LoanApplication> findByCreditScoreGreaterThan(int creditScore);

    // Example: Find loan applications by employment status
    List<LoanApplication> findByEmploymentStatus(String employmentStatus);

    // Example: Find loan applications by income greater than a given value
    List<LoanApplication> findByIncomeGreaterThan(double income);

    // Example: Find loan applications by loan offer accepted
    List<LoanApplication> findByLoanOfferAccepted(boolean loanOfferAccepted);

    // Example: Find loan applications by loan disbursed
    List<LoanApplication> findByLoanDisbursed(boolean loanDisbursed);
}
