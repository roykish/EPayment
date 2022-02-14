package com.ePay.abs.service;

import com.ePay.abs.dao.LogTableRepository;
import com.ePay.abs.dao.StmailidRepository;
import com.ePay.abs.model.STMAILID;
import com.ePay.abs.model.SessionLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private StmailidRepository stmailidRepository;
    @Autowired
    LogTableRepository logTableRepository;

    //Session service
    public void saveLogValues(SessionLog sessionLog){
        System.out.println("ses log "+sessionLog);
        logTableRepository.save(sessionLog);
    }

    public STMAILID loginUser(String userName, String password){
        STMAILID stmailid = stmailidRepository.loginUser(userName, password);
        //String password = stmailid.getPASSWORD();
        String encryptedPassword = stmailidRepository.passwordEncoding(userName,password);
        System.out.println("encrypted password " + encryptedPassword);

        System.out.println(stmailid);
        return stmailid;
    }



}
