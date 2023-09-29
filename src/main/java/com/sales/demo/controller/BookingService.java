package com.sales.demo.controller;

import com.sales.demo.model.Booking;
import com.sales.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepository;

    @Autowired
    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public List<Booking> getBookingsByCustomerId(Long customerId) {
        return bookingRepository.findByCustomerId(customerId);
    }

    public List<Booking> getBookingsByStatusAndCustomerId(String status, Long customerId) {
        return bookingRepository.findByStatusAndCustomerId(status, customerId);
    }

    public List<Booking> getBookingsByRatingAndCustomerId(int rating, Long customerId) {
        return bookingRepository.findByRatingAndCustomerId(rating, customerId);
    }

    public List<Booking> getBookingsByStatus(String status) {
        return bookingRepository.findByStatus(status);
    }

    public List<Booking> getBookingsWithPromotion() {
        return bookingRepository.findByPromotionNotNull();
    }

    public List<Booking> getBookingsWithoutPromotion() {
        return bookingRepository.findByPromotionIsNull();
    }

    public Booking modifyBooking(Long bookingId, Booking modifiedBooking) {
        Booking booking = bookingRepository.findById(bookingId).orElse(null);
        if (booking != null) {
            // Modify the booking based on the modifiedBooking details
            // ...
            return bookingRepository.save(booking);
        }
        return null;
    }

    public boolean cancelBooking(Long bookingId) {
        Booking booking = bookingRepository.findById(bookingId).orElse(null);
        if (booking != null) {
            // Cancel the booking
            // ...
            bookingRepository.delete(booking);
            return true;
        }
        return false;
    }

    public boolean payWithCard(Long bookingId, String cardNumber, String cvv) {
        Booking booking = bookingRepository.findById(bookingId).orElse(null);
        if (booking != null) {
            // Process the payment with the provided card details
            // ...
            return true;
        }
        return false;
    }

    public boolean writeReview(Long bookingId, String review) {
        Booking booking = bookingRepository.findById(bookingId).orElse(null);
        if (booking != null) {
            // Write the review for the booking
            // ...
            return true;
        }
        return false;
    }

    public String getBookingStatus(Long bookingId) {
        Booking booking = bookingRepository.findById(bookingId).orElse(null);
        if (booking != null) {
            // Get the booking status
            // ...
            return booking.getStatus();
        }
        return null;
    }

    public boolean sendFeedback(Long bookingId, String feedback) {
        Booking booking = bookingRepository.findById(bookingId).orElse(null);
        if (booking != null) {
            // Send feedback for the booking
            // ...
            return true;
        }
        return false;
    }

    public List<String> getLatestPromotionsAndDeals() {
        // Get the latest promotions and deals
        // ...
        return null;
    }
}