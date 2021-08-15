package com.kodilla.customer.provider;

import com.kodilla.customer.connector.AccountsConnector;
import com.kodilla.customer.connector.CardsConnector;
import com.kodilla.customer.dto.AccountDto;
import com.kodilla.customer.dto.CardDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountsProvider {
    private final AccountsConnector accountsConnector;
    private final CardsConnector cardsConnector;

    public List<AccountDto> getCustomerAccounts(Long customerId) {
        return accountsConnector.getAccounts(customerId)
                .getAccounts()
                .stream()
                .map(account -> new AccountDto(
                        account.getId(),
                        account.getNrb(),
                        account.getCurrency(),
                        account.getAvailableFunds(),
                        account.getCustomerId()))
                .collect(Collectors.toList());
    }

    public List<CardDto> getCustomerCards(Long customerId) {
        return cardsConnector.getCards(customerId)
                .getCards()
                .stream()
                .map(card -> new CardDto(
                        card.getId(),
                        card.getCardNumber(),
                        card.getCustomerId()))
                .collect(Collectors.toList());
    }
}
