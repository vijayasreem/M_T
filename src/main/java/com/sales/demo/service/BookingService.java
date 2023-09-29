
package com.sales.demo.service;

import com.sales.demo.model.Bookings;
import com.sales.demo.model.Payments;
import com.sales.demo.model.Reviews;
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

    public List<Bookings> getBookingsByCustomerId(Long customerId) {
        return bookingRepository.findByCustomerId(customerId);
    }

    public Bookings getBookingByReferenceId(String bookingReferenceId) {
        return bookingRepository.findByBookingReferenceId(bookingReferenceId);
    }

    public List<Bookings> getBookingsByStatus(String status) {
        return bookingRepository.findByStatus(status);
    }

    public List<Payments> getPaymentsByBookingId(Long bookingId) {
        return bookingRepository.findPaymentsByBookingId(bookingId);
    }

    public List<Reviews> getReviewsByBookingId(Long bookingId) {
        return bookingRepository.findReviewsByBookingId(bookingId);
    }

    // Add more business methods as needed

}
