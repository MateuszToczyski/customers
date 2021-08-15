package com.kodilla.customer.dto;

import lombok.Data;

@Data
public class CardDto {
    private final Long id;
    private final String cardNumber;
    private final Long customerId;
}
