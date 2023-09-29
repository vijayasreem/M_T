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
  
    // Add methods for modifying and canceling bookings, paying with credit or debit card,
    // writing reviews and ratings, checking booking status, sending feedback,
    // and checking for latest promotions and deals as per the user story and acceptance criteria.
    // Implement the methods based on the specific requirements.
    // ...
}