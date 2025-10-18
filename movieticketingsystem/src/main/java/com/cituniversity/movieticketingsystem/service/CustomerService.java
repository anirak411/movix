package com.cituniversity.movieticketingsystem.service;

import com.cituniversity.movieticketingsystem.entity.Customer;
import com.cituniversity.movieticketingsystem.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
    return customerRepository.save(customer);
    }

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}
