/*
 * Copyright (c) 2018. MAV All Rights Reserved
 */
package com.mav.business.uam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * HasLogger is a feature interface that provides Logging capability for anyone
 * implementing it where logger needs to operate in serializable environment
 * without being static.
 */
public interface HasLogger {

    /**
     * Gets logger.
     *
     * @return the logger
     */
    default Logger getLogger() {
        return LoggerFactory.getLogger(getClass());
    }

    /**
     * Log for class.
     *
     * @param level  the level
     * @param output the output
     */
    default void logForClass(String level, String output) {
        String theOutput = "UAM Logger : " + this.getClass().toString() + " : " + output;
        try {
            getLogger().getClass().getMethod(level, String.class).invoke(getLogger(), theOutput);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
