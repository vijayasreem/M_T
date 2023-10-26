
package com.sales.demo.repository;

import com.sales.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM Customer c WHERE c.creditRating = 'Good Credit'")
    List<Customer> findCustomersWithGoodCredit();

    @Query("SELECT c FROM Customer c WHERE c.creditRating = 'Questionable Credit'")
    List<Customer> findCustomersWithQuestionableCredit();

    @Query("SELECT c FROM Customer c WHERE c.creditRating = 'Bad Credit'")
    List<Customer> findCustomersWithBadCredit();
}
