package com.rest.customerapi.services;

import com.rest.customerapi.api.v1.mapper.CustomerMapper;
import com.rest.customerapi.api.v1.model.CustomerDTO;
import com.rest.customerapi.repositories.CustomerRepository;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {

    private final CustomerMapper customerMapper;
    private  final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerMapper customerMapper, CustomerRepository customerRepository) {
        this.customerMapper = customerMapper;
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(customerMapper::customerTOCustomerDTO)
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO getCustomerByName(String name) {
        return customerMapper.customerTOCustomerDTO(customerRepository.findByFirstName(name));
    }
}
