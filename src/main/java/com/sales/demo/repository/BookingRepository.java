
package com.sales.demo.repository;

import com.sales.demo.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
  
    List<Booking> findByCustomerId(Long customerId);
  
    List<Booking> findByStatusAndCustomerId(String status, Long customerId);
  
    List<Booking> findByRatingAndCustomerId(int rating, Long customerId);
  
    List<Booking> findByStatus(String status);
  
    List<Booking> findByPromotionNotNull();
  
    List<Booking> findByPromotionIsNull();
}
