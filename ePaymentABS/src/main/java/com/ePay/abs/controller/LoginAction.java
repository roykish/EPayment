package com.ePay.abs.controller;


import com.ePay.abs.dao.MobileMasterRepository;
import com.ePay.abs.dao.StmailidRepository;
import com.ePay.abs.dao.UserProfileRepository;
import com.ePay.abs.model.MOBILEMASTER;
import com.ePay.abs.model.STMAILID;
import com.ePay.abs.model.SessionLog;
import com.ePay.abs.model.UserProfile;
import com.ePay.abs.service.AccountInfoService;
import com.ePay.abs.service.LoginService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import util.EncryptDecrypt;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class LoginAction {
    @Autowired
    private LoginService loginService;
    @Autowired
    HttpServletRequest request;
    @Autowired
    HttpSession httpSession;
    @Autowired
    StmailidRepository stmailidRepository;
    @Autowired
    UserProfileRepository userProfileRepository;
    @Autowired
    MobileMasterRepository mobileMasterRepository;
    final String secretKey = "ePayment#123ERA&123BankAsia@123!";


    @GetMapping("abs/v1/api/session")
    public ResponseEntity<SessionLog> getSessionData() {
        SessionLog sessionLog = new SessionLog();
        sessionLog.setAmount(httpSession.getAttribute("amount").toString());
        sessionLog.setOrderNo(httpSession.getAttribute("orderNo").toString());
        sessionLog.setGroupID(httpSession.getAttribute("groupID").toString());
        sessionLog.setMarchant(httpSession.getAttribute("marchant").toString());
        sessionLog.setRedirectUrl(httpSession.getAttribute("redirectUrl").toString());
        return new ResponseEntity<>(sessionLog, HttpStatus.OK);
    }

    @GetMapping("abs/v1/api/pasdcnt/update")
    public ResponseEntity<Map<String,Object>> updatePasswordCount(@RequestParam("mailId") String mailId){
        Map<String, Object> response = new HashMap<>();
        stmailidRepository.updatePasswordCount(mailId);
        response.put("error code", "1");
        response.put("message", "Invalid Password. Transaction Denied.");

        return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }

    @GetMapping("abs/v1/api/profile")
    public ResponseEntity<Map<String,Object>> seeProfile(@RequestParam("mailId") String mailId){
        String mr = "Mr. ";
        String ms = "Ms. ";
        String m = "M";
        String f = "F";

        Map<String, Object> response = new HashMap<>();
        UserProfile userProfile = userProfileRepository.getUserProfile(mailId);
        try {

                if(userProfile.getTITLE().equalsIgnoreCase(m)){
                    userProfile.setWELNAME(mr.concat(userProfile.getWELNAME()));
                }
                else if(userProfile.getTITLE().equalsIgnoreCase(f)){
                    userProfile.setWELNAME(ms.concat(userProfile.getWELNAME()));
                }
                else{

                }

            MOBILEMASTER mobileMasterObject = mobileMasterRepository.getGatewayObject(mailId);
            String emailId = userProfile.getMAILID().trim();
            String mobileNumber = mobileMasterObject.getMOBNUM().trim();

//                Map<String, Object> finalResponse = new HashMap<>();
                if(mobileMasterObject.getMOBNUM() == null){
                    mobileMasterObject.setMOBNUM(userProfile.getMOBNUM());
                }

//                else{
//                    mobileNumber = userProfile.getMOBNUM().trim();
//                }
//                    finalResponse.put("emailId",emailId);
//                    finalResponse.put("mobileNumber", mobileNumber);
//                    finalResponse.put("welname", userProfile.getWELNAME());
//            //finalResponse.put("welname", userProfile.getWELNAME());


//                    response.put("error code", "0");
//                    response.put("message", finalResponse);
//                    return new ResponseEntity<>(response, HttpStatus.OK);
            response.put("errorCode", 0);
            response.put("message",userProfile);

            }
            catch (Exception ex){
                response.put("Message", ex.getMessage());
                response.put("ErrorCode", "1");
            }

            return new ResponseEntity<>(response, HttpStatus.OK);
        }

    @GetMapping("abs/v1/api/login")
    public ResponseEntity<Map<String, Object>> loginUser(@RequestParam("epayId") String epayId, @RequestParam(value = "userName", required = true) String userName, @RequestParam(value = "password", required = true) String password) throws
            ParseException, SQLException, ClassNotFoundException, GeneralSecurityException, UnsupportedEncodingException {
        Map<String, Object> response = new HashMap<>();

        if (userName == null || password == null) {
            response.put("message", "Invalid username or password");
            response.put("errorCode", " 1");
        }
        String addingPlus = epayId.replace(' ', '+');
        String decryptedValue = EncryptDecrypt.decryptWithIV(addingPlus, secretKey);
        System.out.println("decrypted data =====" + decryptedValue);
        String ipAddress = request.getRemoteAddr();
        System.out.println("ipAddress =" + ipAddress);
        try {
            JSONObject decryptedObj = new JSONObject(decryptedValue);
            System.out.println(decryptedObj);
            SessionLog sessionVal = new SessionLog();
            sessionVal.setAmount(decryptedObj.getString("amount"));
            sessionVal.setOrderNo(decryptedObj.getString("orderNo"));
            sessionVal.setRedirectUrl(decryptedObj.getString("redirectUrl"));
            sessionVal.setGroupID(decryptedObj.getString("groupID"));
            sessionVal.setMarchant(decryptedObj.getString("marchant"));
            response.put("sessiondata", sessionVal);
            httpSession.setAttribute("amount", decryptedObj.getString("amount"));
            httpSession.setAttribute("orderNo", decryptedObj.getString("orderNo"));
            httpSession.setAttribute("redirectUrl", decryptedObj.getString("redirectUrl"));
            httpSession.setAttribute("groupID", decryptedObj.getString("groupID"));
            httpSession.setAttribute("marchant", decryptedObj.getString("marchant"));
            SessionLog sessionLog = new SessionLog();
            sessionLog.setRequestIP(ipAddress);
            sessionLog.setAmount(httpSession.getAttribute("amount").toString());
            sessionLog.setOrderNo(httpSession.getAttribute("orderNo").toString());
            sessionLog.setGroupID(httpSession.getAttribute("groupID").toString());
            sessionLog.setMarchant(httpSession.getAttribute("marchant").toString());
            sessionLog.setRedirectUrl(httpSession.getAttribute("redirectUrl").toString());
            sessionLog.setRequestDate(new Date());


            System.out.println();
            loginService.saveLogValues(sessionLog);

        } catch (JSONException err) {
            System.out.println();
            response.put("message", "Failed to set data in session");
            response.put("errorCode", "1");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }

        STMAILID stmailid = loginService.loginUser(userName, password);
//        System.out.println("This is the mailId: " + stmailid.getMAILID());
//        System.out.println("this is actflag- "+ stmailid.getACTFLG());

        if(stmailid ==null) {
            response.put("message","invalid username or maildId");
            response.put("errorCode","1");
        }

        else if(stmailidRepository.findRowNumber(stmailid.getMAILID()) > 1)
        {
            response.put("message","More than one User ID. Sign In Denied.");
            response.put("errorCode","1");
//            return new ResponseEntity<>(response, HttpStatus.OK);
        }
        else{
           // throw new NoDataException("1", "Invalid User ID. Sign In Denied");
            response.put("message","Invalid User ID. Sign In Denied");
            response.put("errorCode","1");

        }

        try{
            stmailidRepository.updateLastLoginAndPaswdcnt(stmailid.getMAILID());
            response.put("message",stmailid);
            response.put("errorCode","0");
            System.out.println("Update done");


        }
        catch(Exception ex){
            response.put("message", "Update denied");
            response.put("errorCode","1");
            ex.printStackTrace();

        }
        return new ResponseEntity<>(response, HttpStatus.OK);

    }
}
