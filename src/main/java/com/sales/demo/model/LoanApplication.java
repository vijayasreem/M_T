
package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerId;
    private String status;
    private int creditScore;
    private String employmentStatus;
    private double income;
    private boolean loanOfferAccepted;
    private boolean loanDisbursed;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public boolean isLoanOfferAccepted() {
        return loanOfferAccepted;
    }

    public void setLoanOfferAccepted(boolean loanOfferAccepted) {
        this.loanOfferAccepted = loanOfferAccepted;
    }

    public boolean isLoanDisbursed() {
        return loanDisbursed;
    }

    public void setLoanDisbursed(boolean loanDisbursed) {
        this.loanDisbursed = loanDisbursed;
    }
}
