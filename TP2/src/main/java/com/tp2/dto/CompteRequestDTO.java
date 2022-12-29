package com.tp2.dto;

import com.tp2.enums.AccountType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class CompteRequestDTO {
    private Double balance;
    private String currency;
    private AccountType type;
}
