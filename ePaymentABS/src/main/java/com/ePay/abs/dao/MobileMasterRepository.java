package com.ePay.abs.dao;

import com.ePay.abs.model.MOBILEMASTER;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MobileMasterRepository extends JpaRepository<MOBILEMASTER, String> {
    @Query(value = "SELECT * FROM smsgtway.mobile_master where mailid=:mailId", nativeQuery = true)
    MOBILEMASTER getGatewayObject(String mailId);

}
