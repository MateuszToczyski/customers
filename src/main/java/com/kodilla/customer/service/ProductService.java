package com.kodilla.customer.service;

import com.kodilla.customer.dto.AccountDto;
import com.kodilla.customer.dto.CardDto;
import com.kodilla.customer.provider.AccountsProvider;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final AccountsProvider accountProvider;

    public List<AccountDto> findCustomerAccounts(Long customerId) {
        return accountProvider.getCustomerAccounts(customerId);
    }

    public List<CardDto> findCustomerCards(Long customerId) {
        return accountProvider.getCustomerCards(customerId);
    }

}