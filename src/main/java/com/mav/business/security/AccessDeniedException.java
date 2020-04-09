/*
 * Copyright (c) 2018. MAV All Rights Reserved
 */
package com.mav.business.security;

/**
 * The type Access denied exception.
 */
public class AccessDeniedException extends RuntimeException {
    /**
     * Instantiates a new Access denied exception.
     */
    public AccessDeniedException() {

    }

    /**
     * Instantiates a new Access denied exception.
     *
     * @param message the message
     */
    public AccessDeniedException(String message) {
        super(message);
    }
}
