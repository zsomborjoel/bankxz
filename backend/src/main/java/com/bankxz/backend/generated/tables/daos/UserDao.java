/*
 * This file is generated by jOOQ.
 */
package com.bankxz.backend.generated.tables.daos;


import com.bankxz.backend.generated.tables.User;
import com.bankxz.backend.generated.tables.records.UserRecord;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class UserDao extends DAOImpl<UserRecord, com.bankxz.backend.generated.tables.pojos.User, UUID> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, com.bankxz.backend.generated.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    @Autowired
    public UserDao(Configuration configuration) {
        super(User.USER, com.bankxz.backend.generated.tables.pojos.User.class, configuration);
    }

    @Override
    public UUID getId(com.bankxz.backend.generated.tables.pojos.User object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchRangeOfId(UUID lowerInclusive, UUID upperInclusive) {
        return fetchRange(User.USER.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchById(UUID... values) {
        return fetch(User.USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.bankxz.backend.generated.tables.pojos.User fetchOneById(UUID value) {
        return fetchOne(User.USER.ID, value);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public Optional<com.bankxz.backend.generated.tables.pojos.User> fetchOptionalById(UUID value) {
        return fetchOptional(User.USER.ID, value);
    }

    /**
     * Fetch records that have <code>email BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchRangeOfEmail(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.EMAIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>email IN (values)</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchByEmail(String... values) {
        return fetch(User.USER.EMAIL, values);
    }

    /**
     * Fetch a unique record that has <code>email = value</code>
     */
    public com.bankxz.backend.generated.tables.pojos.User fetchOneByEmail(String value) {
        return fetchOne(User.USER.EMAIL, value);
    }

    /**
     * Fetch a unique record that has <code>email = value</code>
     */
    public Optional<com.bankxz.backend.generated.tables.pojos.User> fetchOptionalByEmail(String value) {
        return fetchOptional(User.USER.EMAIL, value);
    }

    /**
     * Fetch records that have <code>first_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchRangeOfFirstName(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.FIRST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>first_name IN (values)</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchByFirstName(String... values) {
        return fetch(User.USER.FIRST_NAME, values);
    }

    /**
     * Fetch records that have <code>last_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchRangeOfLastName(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.LAST_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_name IN (values)</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchByLastName(String... values) {
        return fetch(User.USER.LAST_NAME, values);
    }

    /**
     * Fetch records that have <code>mothers_name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchRangeOfMothersName(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.MOTHERS_NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>mothers_name IN (values)</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchByMothersName(String... values) {
        return fetch(User.USER.MOTHERS_NAME, values);
    }

    /**
     * Fetch records that have <code>tax_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchRangeOfTaxId(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.TAX_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>tax_id IN (values)</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchByTaxId(String... values) {
        return fetch(User.USER.TAX_ID, values);
    }

    /**
     * Fetch records that have <code>social_security_number BETWEEN
     * lowerInclusive AND upperInclusive</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchRangeOfSocialSecurityNumber(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.SOCIAL_SECURITY_NUMBER, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>social_security_number IN (values)</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchBySocialSecurityNumber(String... values) {
        return fetch(User.USER.SOCIAL_SECURITY_NUMBER, values);
    }

    /**
     * Fetch records that have <code>date_of_birth BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchRangeOfDateOfBirth(LocalDate lowerInclusive, LocalDate upperInclusive) {
        return fetchRange(User.USER.DATE_OF_BIRTH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>date_of_birth IN (values)</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchByDateOfBirth(LocalDate... values) {
        return fetch(User.USER.DATE_OF_BIRTH, values);
    }

    /**
     * Fetch records that have <code>place_of_birth BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchRangeOfPlaceOfBirth(String lowerInclusive, String upperInclusive) {
        return fetchRange(User.USER.PLACE_OF_BIRTH, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>place_of_birth IN (values)</code>
     */
    public List<com.bankxz.backend.generated.tables.pojos.User> fetchByPlaceOfBirth(String... values) {
        return fetch(User.USER.PLACE_OF_BIRTH, values);
    }
}
