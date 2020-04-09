package com.mav.business.service;

import com.mav.business.model.User;
import com.mav.business.repository.UserRespository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

import static org.mockito.Mockito.*;

class UserServiceTest {
    @Mock
    UserRespository repository;
    @InjectMocks
    UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSaveUser() {
        User result = userService.saveUser(new User());
        Assertions.assertEquals(new User(), result);
    }

    @Test
    void testGetLogger() {
        Logger result = userService.getLogger();
        Assertions.assertEquals(null, result);
    }

    @Test
    void testLogForClass() {
        userService.logForClass("level", "output");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme