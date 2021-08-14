package com.kodilla.customer.mapper;

import com.kodilla.customer.domain.Customer;
import com.kodilla.customer.dto.CustomerDto;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public Customer toCustomer(CustomerDto customerDto) {
        return new Customer(customerDto.getId(), customerDto.getFirstName(), customerDto.getLastName());
    }

    public CustomerDto toCustomerDto(Customer customer) {
        return new CustomerDto(customer.getId(), customer.getFirstName(), customer.getLastName());
    }
}
