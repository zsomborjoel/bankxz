/*
 * This file is generated by jOOQ.
 */
package com.bankxz.backend.generated.tables.records;


import com.bankxz.backend.generated.tables.Transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TransactionRecord extends UpdatableRecordImpl<TransactionRecord> implements Record6<UUID, UUID, BigDecimal, String, String, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.transaction.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.transaction.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.transaction.account_id</code>.
     */
    public void setAccountId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.transaction.account_id</code>.
     */
    public UUID getAccountId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>public.transaction.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.transaction.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>public.transaction.currency</code>.
     */
    public void setCurrency(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.transaction.currency</code>.
     */
    public String getCurrency() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.transaction.recipient_account_number</code>.
     */
    public void setRecipientAccountNumber(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.transaction.recipient_account_number</code>.
     */
    public String getRecipientAccountNumber() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.transaction.started_at</code>.
     */
    public void setStartedAt(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.transaction.started_at</code>.
     */
    public LocalDateTime getStartedAt() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, UUID, BigDecimal, String, String, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UUID, UUID, BigDecimal, String, String, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return Transaction.TRANSACTION.ID;
    }

    @Override
    public Field<UUID> field2() {
        return Transaction.TRANSACTION.ACCOUNT_ID;
    }

    @Override
    public Field<BigDecimal> field3() {
        return Transaction.TRANSACTION.AMOUNT;
    }

    @Override
    public Field<String> field4() {
        return Transaction.TRANSACTION.CURRENCY;
    }

    @Override
    public Field<String> field5() {
        return Transaction.TRANSACTION.RECIPIENT_ACCOUNT_NUMBER;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Transaction.TRANSACTION.STARTED_AT;
    }

    @Override
    public UUID component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getAccountId();
    }

    @Override
    public BigDecimal component3() {
        return getAmount();
    }

    @Override
    public String component4() {
        return getCurrency();
    }

    @Override
    public String component5() {
        return getRecipientAccountNumber();
    }

    @Override
    public LocalDateTime component6() {
        return getStartedAt();
    }

    @Override
    public UUID value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getAccountId();
    }

    @Override
    public BigDecimal value3() {
        return getAmount();
    }

    @Override
    public String value4() {
        return getCurrency();
    }

    @Override
    public String value5() {
        return getRecipientAccountNumber();
    }

    @Override
    public LocalDateTime value6() {
        return getStartedAt();
    }

    @Override
    public TransactionRecord value1(UUID value) {
        setId(value);
        return this;
    }

    @Override
    public TransactionRecord value2(UUID value) {
        setAccountId(value);
        return this;
    }

    @Override
    public TransactionRecord value3(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public TransactionRecord value4(String value) {
        setCurrency(value);
        return this;
    }

    @Override
    public TransactionRecord value5(String value) {
        setRecipientAccountNumber(value);
        return this;
    }

    @Override
    public TransactionRecord value6(LocalDateTime value) {
        setStartedAt(value);
        return this;
    }

    @Override
    public TransactionRecord values(UUID value1, UUID value2, BigDecimal value3, String value4, String value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransactionRecord
     */
    public TransactionRecord() {
        super(Transaction.TRANSACTION);
    }

    /**
     * Create a detached, initialised TransactionRecord
     */
    public TransactionRecord(UUID id, UUID accountId, BigDecimal amount, String currency, String recipientAccountNumber, LocalDateTime startedAt) {
        super(Transaction.TRANSACTION);

        setId(id);
        setAccountId(accountId);
        setAmount(amount);
        setCurrency(currency);
        setRecipientAccountNumber(recipientAccountNumber);
        setStartedAt(startedAt);
        resetChangedOnNotNull();
    }
}
