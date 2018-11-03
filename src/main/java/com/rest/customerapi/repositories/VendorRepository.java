package com.rest.customerapi.repositories;

import com.rest.customerapi.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
