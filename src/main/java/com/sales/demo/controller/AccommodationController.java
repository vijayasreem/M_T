package com.sales.demo.controller;

import com.sales.demo.model.Accommodation;
import com.sales.demo.service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/accommodations")
public class AccommodationController {

    private AccommodationService accommodationService;

    @Autowired
    public AccommodationController(AccommodationService accommodationService) {
        this.accommodationService = accommodationService;
    }

    @GetMapping("/search")
    public List<Accommodation> searchAccommodations(@RequestParam String location,
                                                    @RequestParam LocalDate checkInDate,
                                                    @RequestParam LocalDate checkOutDate) {
        return accommodationService.searchAccommodations(location, checkInDate, checkOutDate);
    }

    @GetMapping("/searchByRating")
    public List<Accommodation> searchAccommodationsByRating(@RequestParam double rating) {
        return accommodationService.searchAccommodationsByRating(rating);
    }

    @GetMapping("/searchByBookingStatus")
    public List<Accommodation> searchAccommodationsByBookingStatus(@RequestParam String bookingStatus) {
        return accommodationService.searchAccommodationsByBookingStatus(bookingStatus);
    }

    @GetMapping("/searchByCustomerId")
    public List<Accommodation> searchAccommodationsByCustomerId(@RequestParam Long customerId) {
        return accommodationService.searchAccommodationsByCustomerId(customerId);
    }

    @GetMapping("/searchAvailable")
    public List<Accommodation> searchAvailableAccommodations(@RequestParam String location,
                                                             @RequestParam LocalDate checkInDate,
                                                             @RequestParam LocalDate checkOutDate,
                                                             @RequestParam int capacity) {
        return accommodationService.searchAvailableAccommodations(location, checkInDate, checkOutDate, capacity);
    }

    @GetMapping("/searchCustomerBookings")
    public List<Accommodation> searchCustomerBookings(@RequestParam Long customerId) {
        return accommodationService.searchCustomerBookings(customerId);
    }

    @GetMapping("/searchUpcomingBookings")
    public List<Accommodation> searchUpcomingBookings() {
        return accommodationService.searchUpcomingBookings();
    }

    @GetMapping("/searchPastBookings")
    public List<Accommodation> searchPastBookings() {
        return accommodationService.searchPastBookings();
    }

    @GetMapping("/searchPromotionsAndDeals")
    public List<Accommodation> searchPromotionsAndDeals(@RequestParam String location) {
        return accommodationService.searchPromotionsAndDeals(location);
    }
    
    // Add more methods for modifying and canceling bookings, writing reviews, checking booking status, sending feedback, etc.
}