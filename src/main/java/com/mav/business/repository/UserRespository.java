/*
 * Copyright (c) 2018. MAV All Rights Reserved
 */
package com.mav.business.repository;

import com.mav.business.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User, String> {

}
