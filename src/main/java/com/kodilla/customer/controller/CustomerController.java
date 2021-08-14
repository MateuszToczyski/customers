package com.kodilla.customer.controller;

import com.kodilla.customer.controller.response.GetCustomerResponse;
import com.kodilla.customer.dto.CustomerDto;
import com.kodilla.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RefreshScope
@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("{id}")
    public ResponseEntity<GetCustomerResponse> getCustomerById(@PathVariable Long id) {
        CustomerDto customerDto = customerService.findById(id);
        if (customerDto == null) {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(new GetCustomerResponse(customerDto), HttpStatus.OK);
        }
    }
}
