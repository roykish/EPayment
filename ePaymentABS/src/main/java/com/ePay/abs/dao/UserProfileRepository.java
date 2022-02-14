package com.ePay.abs.dao;

import com.ePay.abs.model.MOBILEMASTER;
import com.ePay.abs.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, String> {
    @Query(value = "SELECT * FROM IBANKING.USER_PROFILE  where mailid=:mailId", nativeQuery = true)
    UserProfile getUserProfile(String mailId);






}
