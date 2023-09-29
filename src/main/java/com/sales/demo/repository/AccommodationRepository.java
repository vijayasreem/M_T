
package com.sales.demo.repository;

import com.sales.demo.model.Accommodation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {

    List<Accommodation> findByLocationAndCheckInDateAndCheckOutDate(String location, LocalDate checkInDate, LocalDate checkOutDate);

    List<Accommodation> findByRatingGreaterThanEqual(double rating);

    List<Accommodation> findByBookingStatus(String bookingStatus);

    List<Accommodation> findByCustomerId(Long customerId);

    @Query("SELECT a FROM Accommodation a WHERE a.location = ?1 AND a.checkInDate = ?2 AND a.checkOutDate = ?3 AND a.capacity >= ?4")
    List<Accommodation> findAvailableAccommodations(String location, LocalDate checkInDate, LocalDate checkOutDate, int capacity);

    @Query("SELECT a FROM Accommodation a WHERE a.customerId = ?1 AND a.bookingStatus = 'BOOKED'")
    List<Accommodation> findCustomerBookings(Long customerId);

    @Query(value = "SELECT * FROM Accommodation a WHERE a.checkInDate > CURDATE() AND a.bookingStatus = 'BOOKED'", nativeQuery = true)
    List<Accommodation> findUpcomingBookings();

    @Query(value = "SELECT * FROM Accommodation a WHERE a.checkInDate < CURDATE() AND a.bookingStatus = 'BOOKED'", nativeQuery = true)
    List<Accommodation> findPastBookings();

    @Query("SELECT a FROM Accommodation a WHERE a.location = ?1 AND a.checkInDate >= CURDATE() AND a.bookingStatus = 'AVAILABLE'")
    List<Accommodation> findPromotionsAndDeals(String location);

}
