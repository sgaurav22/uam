/*
 * Copyright (c) 2018. MAV All Rights Reserved
 */
package com.mav.business.model;

/**
 * The interface Current user.
 */
@FunctionalInterface
public interface CurrentUser {
    /**
     * Gets user.
     *
     * @return the User Object
     */
    User getUser();
}
