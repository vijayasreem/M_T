package com.sales.demo.controller;

import com.sales.demo.model.Bookings;
import com.sales.demo.model.Payments;
import com.sales.demo.model.Reviews;
import com.sales.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @GetMapping("/customer/{customerId}")
    public List<Bookings> getBookingsByCustomerId(@PathVariable Long customerId) {
        return bookingService.getBookingsByCustomerId(customerId);
    }

    @GetMapping("/{bookingReferenceId}")
    public Bookings getBookingByReferenceId(@PathVariable String bookingReferenceId) {
        return bookingService.getBookingByReferenceId(bookingReferenceId);
    }

    @GetMapping("/status/{status}")
    public List<Bookings> getBookingsByStatus(@PathVariable String status) {
        return bookingService.getBookingsByStatus(status);
    }

    @GetMapping("/{bookingId}/payments")
    public List<Payments> getPaymentsByBookingId(@PathVariable Long bookingId) {
        return bookingService.getPaymentsByBookingId(bookingId);
    }

    @GetMapping("/{bookingId}/reviews")
    public List<Reviews> getReviewsByBookingId(@PathVariable Long bookingId) {
        return bookingService.getReviewsByBookingId(bookingId);
    }

    // Add more API endpoints for other business methods as needed

}