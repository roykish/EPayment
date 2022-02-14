package com.ePay.abs.service;

import com.ePay.abs.dao.AccountInfoRepository;
import com.ePay.abs.dto.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountInfoService {

    @Autowired
    AccountInfoRepository accountInfoRepository;
    public AccountInfo getAccountInfo(){
         AccountInfo accountInfo = new AccountInfo();
         String output =  accountInfoRepository.accountInfo();
         String[] res = output.split(",");
        accountInfo.setAccountNumber(res[0]);
        accountInfo.setAccountTitle(res[1]);
        accountInfo.setAccountType(res[2]);
        accountInfo.setAccountDescription(res[3]);
        accountInfo.setCurrency(res[4]);
        accountInfo.setAccountBalance(res[5]);
//        accountInfo.setCuscod(res[6]);
        return accountInfo;
    }
}
