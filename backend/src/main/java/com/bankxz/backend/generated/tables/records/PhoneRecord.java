/*
 * This file is generated by jOOQ.
 */
package com.bankxz.backend.generated.tables.records;


import com.bankxz.backend.generated.tables.Phone;

import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PhoneRecord extends UpdatableRecordImpl<PhoneRecord> implements Record3<UUID, String, UUID> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.phone.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.phone.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.phone.number</code>.
     */
    public void setNumber(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.phone.number</code>.
     */
    public String getNumber() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.phone.user_id</code>.
     */
    public void setUserId(UUID value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.phone.user_id</code>.
     */
    public UUID getUserId() {
        return (UUID) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<UUID, String, UUID> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<UUID, String, UUID> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Phone.PHONE.ID;
    }

    @Override
    public Field<String> field2() {
        return Phone.PHONE.NUMBER;
    }

    @Override
    public Field<UUID> field3() {
        return Phone.PHONE.USER_ID;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getNumber();
    }

    @Override
    public UUID component3() {
        return getUserId();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getNumber();
    }

    @Override
    public UUID value3() {
        return getUserId();
    }

    @Override
    public PhoneRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public PhoneRecord value2(String value) {
        setNumber(value);
        return this;
    }

    @Override
    public PhoneRecord value3(UUID value) {
        setUserId(value);
        return this;
    }

    @Override
    public PhoneRecord values(UUID value1, String value2, UUID value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PhoneRecord
     */
    public PhoneRecord() {
        super(Phone.PHONE);
    }

    /**
     * Create a detached, initialised PhoneRecord
     */
    public PhoneRecord(UUID id, String number, UUID userId) {
        super(Phone.PHONE);

        setId(id);
        setNumber(number);
        setUserId(userId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PhoneRecord
     */
    public PhoneRecord(com.bankxz.backend.generated.tables.pojos.Phone value) {
        super(Phone.PHONE);

        if (value != null) {
            setId(value.getId());
            setNumber(value.getNumber());
            setUserId(value.getUserId());
            resetChangedOnNotNull();
        }
    }
}
