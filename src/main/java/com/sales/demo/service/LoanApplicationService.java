
package com.sales.demo.service;

import com.sales.demo.model.LoanApplication;
import com.sales.demo.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public List<LoanApplication> findByCustomerId(String customerId) {
        return loanApplicationRepository.findByCustomerId(customerId);
    }

    public List<LoanApplication> findByStatus(String status) {
        return loanApplicationRepository.findByStatus(status);
    }

    public List<LoanApplication> findByCreditScoreGreaterThan(int creditScore) {
        return loanApplicationRepository.findByCreditScoreGreaterThan(creditScore);
    }

    public List<LoanApplication> findByEmploymentStatus(String employmentStatus) {
        return loanApplicationRepository.findByEmploymentStatus(employmentStatus);
    }

    public List<LoanApplication> findByIncomeGreaterThan(double income) {
        return loanApplicationRepository.findByIncomeGreaterThan(income);
    }

    public List<LoanApplication> findByLoanOfferAccepted(boolean loanOfferAccepted) {
        return loanApplicationRepository.findByLoanOfferAccepted(loanOfferAccepted);
    }

    public List<LoanApplication> findByLoanDisbursed(boolean loanDisbursed) {
        return loanApplicationRepository.findByLoanDisbursed(loanDisbursed);
    }
}
