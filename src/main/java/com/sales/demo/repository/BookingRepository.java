
package com.sales.demo.repository;

import com.sales.demo.model.Bookings;
import com.sales.demo.model.Payments;
import com.sales.demo.model.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Bookings, Long> {

    // Query to get bookings by customer ID
    @Query("SELECT b FROM Bookings b WHERE b.customerId = ?1")
    List<Bookings> findByCustomerId(Long customerId);

    // Query to get bookings by booking reference ID
    @Query("SELECT b FROM Bookings b WHERE b.bookingReferenceId = ?1")
    Bookings findByBookingReferenceId(String bookingReferenceId);

    // Query to get bookings by status
    @Query("SELECT b FROM Bookings b WHERE b.status = ?1")
    List<Bookings> findByStatus(String status);

    // Query to get payments by booking ID
    @Query("SELECT p FROM Payments p WHERE p.bookingId = ?1")
    List<Payments> findPaymentsByBookingId(Long bookingId);

    // Query to get reviews by booking ID
    @Query("SELECT r FROM Reviews r WHERE r.bookingId = ?1")
    List<Reviews> findReviewsByBookingId(Long bookingId);
}
