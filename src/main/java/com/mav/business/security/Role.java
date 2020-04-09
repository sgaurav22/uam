/*
 * Copyright (c) 2018. MAV All Rights Reserved
 */
package com.mav.business.security;

/**
 * The type Role.
 */
public class Role {
    /**
     * The constant USER.
     * This role allows only read access to dashboards
     */
    public static final String USER = "USER";
    /**
     * The constant POWERUSER.
     * This role allows for configruration and
     * creation of dashboards and tiles
     */
    public static final String POWERUSER = "POWERUSER";
    /**
     * The constant ADMIN.
     This role implicitly allows access to all views.
     */
    public static final String ADMIN = "ADMIN";
    /**
     * The constant STUDENT.
     * This role allows STUDENT level access to dashboards and views.
     * allowed to perform remediation of instances where functionality exists.
     * allowed to define rules for automated remediation
     */
    public static final String STUDENT = "STUDENT";

    /**
     * The constant FACULTY.
     * This role allows FACULTY level access to dashboards and views.
     * allowed to perform remediation of instances where functionality exists.
     * allowed to define rules for automated remediation
     */
    public static final String FACULTY = "FACULTY";

    private Role() {
        // Static methods and fields only
    }

    /**
     * Get all roles string [ ].
     *
     * @return the string [ ]
     */
    public static String[] getAllRoles() {
        return new String[]{USER, POWERUSER, ADMIN, STUDENT, FACULTY,
                "ROLE_"+USER, "ROLE_"+POWERUSER, "ROLE_"+ADMIN, "ROLE_"+STUDENT, "ROLE_"+FACULTY}; // added ROLE_ prefix for Azure AD
    }

}
