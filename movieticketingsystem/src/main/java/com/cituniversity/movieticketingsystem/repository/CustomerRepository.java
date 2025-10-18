package com.cituniversity.movieticketingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cituniversity.movieticketingsystem.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
