package com.gianni.msscbrewery.web.mappers;

import com.gianni.msscbrewery.domain.Customer;
import com.gianni.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);

    Customer CustomerDtoToCustomer(CustomerDto customerDto);
}
