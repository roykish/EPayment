package com.ePay.abs.controller;

import com.ePay.abs.dto.AccountInfo;
import com.ePay.abs.service.AccountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AccountInfoController {

    @Autowired
    AccountInfoService accountInfoService;

    @GetMapping("/v1/api/info")
    public AccountInfo accInfo(){

        AccountInfo accountInfo = accountInfoService.getAccountInfo();
//         accountInfo.get
          return accountInfo;


    }
}
