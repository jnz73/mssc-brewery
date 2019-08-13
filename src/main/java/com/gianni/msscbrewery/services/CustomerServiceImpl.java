package com.gianni.msscbrewery.services;

import com.gianni.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .userName("Gianni")
                .build();
    }
}