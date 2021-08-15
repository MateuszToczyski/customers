package com.kodilla.customer.connector.response;

import com.kodilla.customer.dto.CardDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetCardsResponse {
    private List<CardDto> cards;
}
