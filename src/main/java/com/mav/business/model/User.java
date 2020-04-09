/*
 * Copyright (c) 2018. MAV All Rights Reserved
 */
package com.mav.business.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Objects;

/**
 * The type User.
 */
@Entity(name = "UserInformation")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    //Email address
    @NotEmpty
    @Email
    @Size(max = 255)
    @Column(unique = true)
    private String email;

    //password hash
    @NotNull
    @Size(min = 4, max = 255)
    private String passwordHash;

    //first name
    @NotBlank
    @Size(max = 255)
    private String firstName;

    //lastname
    @NotBlank
    @Size(max = 255)
    private String lastName;

    //role
    @NotBlank
    @Size(max = 255)
    private String role;

    //indicates whether user record is locked (not locked out)
    private boolean locked = false;

    /**
     * Instantiates a new User.
     */
    public User() {
        // An empty constructor is needed for all beans
    }

    //Persistence API telling to run prepareData before persisting it
    @PrePersist
    //Before data is updated run perpareData
    @PreUpdate
    private void prepareData() {
        this.email = email == null ? null : email.toLowerCase();
    }

    /**
     * Gets password hash.
     *
     * @return the password hash
     */
    public String getPasswordHash() {
        return passwordHash;
    }

    /**
     * Sets password hash.
     *
     * @param passwordHash the password hash
     */
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets last name.
     *
     * @param lastName the last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets role.
     *
     * @return the role
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets role.
     *
     * @param role the role
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Is locked boolean.
     *
     * @return the boolean
     */
    public boolean isLocked() {
        return locked;
    }

    /**
     * Sets locked.
     *
     * @param locked the locked
     */
    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    //Override of the equals method to create a match based on criteria we want instead of the default equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        User that = (User) o;
        return locked == that.locked &&
                Objects.equals(email, that.email) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(role, that.role);
    }

    //Override of the hashCode method to return a representation that makes sense for the app and not the default
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email, firstName, lastName, role, locked);
    }

}

