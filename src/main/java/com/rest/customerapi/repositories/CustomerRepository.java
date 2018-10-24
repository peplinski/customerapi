package com.rest.customerapi.repositories;

import com.rest.customerapi.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findByFirstName(String name);
}
