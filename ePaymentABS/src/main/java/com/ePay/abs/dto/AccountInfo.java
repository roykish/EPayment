package com.ePay.abs.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountInfo {
    private String accountNumber;
    private String accountTitle;
    private String accountType;
    private String accountDescription;
    private String currency;
    private String accountBalance;
//    private String cuscod;
}
