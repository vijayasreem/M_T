package com.sales.demo.service;

import com.sales.demo.model.Accommodation;
import com.sales.demo.repository.AccommodationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AccommodationService {

    private AccommodationRepository accommodationRepository;

    @Autowired
    public AccommodationService(AccommodationRepository accommodationRepository) {
        this.accommodationRepository = accommodationRepository;
    }

    public List<Accommodation> searchAccommodations(String location, LocalDate checkInDate, LocalDate checkOutDate) {
        return accommodationRepository.findByLocationAndCheckInDateAndCheckOutDate(location, checkInDate, checkOutDate);
    }

    public List<Accommodation> searchAccommodationsByRating(double rating) {
        return accommodationRepository.findByRatingGreaterThanEqual(rating);
    }

    public List<Accommodation> searchAccommodationsByBookingStatus(String bookingStatus) {
        return accommodationRepository.findByBookingStatus(bookingStatus);
    }

    public List<Accommodation> searchAccommodationsByCustomerId(Long customerId) {
        return accommodationRepository.findByCustomerId(customerId);
    }

    public List<Accommodation> searchAvailableAccommodations(String location, LocalDate checkInDate, LocalDate checkOutDate, int capacity) {
        return accommodationRepository.findAvailableAccommodations(location, checkInDate, checkOutDate, capacity);
    }

    public List<Accommodation> searchCustomerBookings(Long customerId) {
        return accommodationRepository.findCustomerBookings(customerId);
    }

    public List<Accommodation> searchUpcomingBookings() {
        return accommodationRepository.findUpcomingBookings();
    }

    public List<Accommodation> searchPastBookings() {
        return accommodationRepository.findPastBookings();
    }

    public List<Accommodation> searchPromotionsAndDeals(String location) {
        return accommodationRepository.findPromotionsAndDeals(location);
    }
}