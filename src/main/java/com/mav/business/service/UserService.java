/*
 * Copyright (c) 2018. MAV All Rights Reserved
 */
package com.mav.business.service;

import com.mav.business.model.User;
import com.mav.business.repository.UserRespository;
import com.mav.business.uam.HasLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements HasLogger {

    private UserRespository repository;

    @Autowired
    public UserService(UserRespository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        User persisted = null;
        try {
            persisted = repository.saveAndFlush(user);
            return persisted;
        } catch (Exception ex) {
            getLogger().error("Error occurred while saving User."+ex.getMessage());
            ex.getMessage();
            return null;
        }
    }
}
