package com.sales.demo.controller;

import com.sales.demo.model.LoanApplication;
import com.sales.demo.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/customer/{customerId}")
    public List<LoanApplication> findByCustomerId(@PathVariable String customerId) {
        return loanApplicationService.findByCustomerId(customerId);
    }

    @GetMapping("/status/{status}")
    public List<LoanApplication> findByStatus(@PathVariable String status) {
        return loanApplicationService.findByStatus(status);
    }

    @GetMapping("/creditScore/{creditScore}")
    public List<LoanApplication> findByCreditScoreGreaterThan(@PathVariable int creditScore) {
        return loanApplicationService.findByCreditScoreGreaterThan(creditScore);
    }

    @GetMapping("/employmentStatus/{employmentStatus}")
    public List<LoanApplication> findByEmploymentStatus(@PathVariable String employmentStatus) {
        return loanApplicationService.findByEmploymentStatus(employmentStatus);
    }

    @GetMapping("/income/{income}")
    public List<LoanApplication> findByIncomeGreaterThan(@PathVariable double income) {
        return loanApplicationService.findByIncomeGreaterThan(income);
    }

    @GetMapping("/loanOfferAccepted/{loanOfferAccepted}")
    public List<LoanApplication> findByLoanOfferAccepted(@PathVariable boolean loanOfferAccepted) {
        return loanApplicationService.findByLoanOfferAccepted(loanOfferAccepted);
    }

    @GetMapping("/loanDisbursed/{loanDisbursed}")
    public List<LoanApplication> findByLoanDisbursed(@PathVariable boolean loanDisbursed) {
        return loanApplicationService.findByLoanDisbursed(loanDisbursed);
    }

    // Add other methods for handling loan application requests (e.g., create, update, delete)
}