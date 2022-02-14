package com.ePay.abs.service;

import com.ePay.abs.dao.UserProfileRepository;
import com.ePay.abs.model.UserProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {
    @Autowired
    private UserProfileRepository userProfileRepository;
    public UserProfile accessUserProfile(String mailId){
        return userProfileRepository.getUserProfile(mailId);
    }
}
