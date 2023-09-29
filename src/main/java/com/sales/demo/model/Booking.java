
package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Booking {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    private Long customerId;
  
    private String status;
  
    private int rating;
  
    private String promotion;
  
    // Getters and Setters
  
    public Long getId() {
        return id;
    }
  
    public void setId(Long id) {
        this.id = id;
    }
  
    public Long getCustomerId() {
        return customerId;
    }
  
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
  
    public String getStatus() {
        return status;
    }
  
    public void setStatus(String status) {
        this.status = status;
    }
  
    public int getRating() {
        return rating;
    }
  
    public void setRating(int rating) {
        this.rating = rating;
    }
  
    public String getPromotion() {
        return promotion;
    }
  
    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }
}
