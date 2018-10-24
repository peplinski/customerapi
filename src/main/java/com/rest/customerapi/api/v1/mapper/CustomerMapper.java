package com.rest.customerapi.api.v1.mapper;

import com.rest.customerapi.api.v1.model.CustomerDTO;
import com.rest.customerapi.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    CustomerDTO customerTOCustomerDTO(Customer customer);
}
