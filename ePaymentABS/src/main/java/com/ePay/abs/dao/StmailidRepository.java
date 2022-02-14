package com.ePay.abs.dao;

import com.ePay.abs.model.STMAILID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface StmailidRepository extends JpaRepository<STMAILID,String> {
    @Query(value="SELECT MAILID,USERID,PASSWORD,CUSCOD,ACTFLG,PASWDCNT,LSTLOGIN,TODAY,SESSIONS,LOGINEXPIRED,LASTPASSCHANGED,CONFFLG,ADOPTFLG,PASSFLG FROM IBANKING.STMAILID WHERE STMAILID.USERID = ?1 AND STMAILID.MAILID = ?1",nativeQuery = true)
    STMAILID loginUser(String userName,String password);

    @Query(value = "SELECT COUNT(*) FROM IBANKING.STMAILID where mailid=:mailId", nativeQuery = true)
    Integer findRowNumber(@Param("mailId") String mailId);

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE IBANKING.STMAILID SET lstlogin = SYSDATE, paswdcnt = 0 WHERE MAILID=:mailId", nativeQuery = true)
    void updateLastLoginAndPaswdcnt(@Param("mailId") String mailId);

    @Query(value = "SELECT IBANKING.dfn_create_password_encrypted (?1, ?2) from dual", nativeQuery = true)
    String passwordEncoding(String userName, String password);


//    @Query(value = "SELECT * FROM IBANKING.STMAILID  where mailid=:mailId", nativeQuery = true )
//    STMAILID updatePassCnt(@Param("mailId") String mailId);

    @Modifying(clearAutomatically = true)
    @Query(value = "UPDATE IBANKING.STMAILID SET STMAILID.paswdcnt = STMAILID.paswdcnt +1 WHERE MAILID=:mailId", nativeQuery = true)
    void updatePasswordCount(@Param("mailId") String mailId);

}
