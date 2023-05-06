/*
 * This file is generated by jOOQ.
 */
package com.bankxz.backend.generated.tables;


import com.bankxz.backend.generated.Keys;
import com.bankxz.backend.generated.Public;
import com.bankxz.backend.generated.tables.records.TransactionRecord;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Transaction extends TableImpl<TransactionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.transaction</code>
     */
    public static final Transaction TRANSACTION = new Transaction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TransactionRecord> getRecordType() {
        return TransactionRecord.class;
    }

    /**
     * The column <code>public.transaction.id</code>.
     */
    public final TableField<TransactionRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.transaction.account_id</code>.
     */
    public final TableField<TransactionRecord, UUID> ACCOUNT_ID = createField(DSL.name("account_id"), SQLDataType.UUID, this, "");

    /**
     * The column <code>public.transaction.amount</code>.
     */
    public final TableField<TransactionRecord, BigDecimal> AMOUNT = createField(DSL.name("amount"), SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.transaction.currency</code>.
     */
    public final TableField<TransactionRecord, String> CURRENCY = createField(DSL.name("currency"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.transaction.recipient_account_number</code>.
     */
    public final TableField<TransactionRecord, String> RECIPIENT_ACCOUNT_NUMBER = createField(DSL.name("recipient_account_number"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.transaction.started_at</code>.
     */
    public final TableField<TransactionRecord, LocalDateTime> STARTED_AT = createField(DSL.name("started_at"), SQLDataType.LOCALDATETIME(6), this, "");

    private Transaction(Name alias, Table<TransactionRecord> aliased) {
        this(alias, aliased, null);
    }

    private Transaction(Name alias, Table<TransactionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.transaction</code> table reference
     */
    public Transaction(String alias) {
        this(DSL.name(alias), TRANSACTION);
    }

    /**
     * Create an aliased <code>public.transaction</code> table reference
     */
    public Transaction(Name alias) {
        this(alias, TRANSACTION);
    }

    /**
     * Create a <code>public.transaction</code> table reference
     */
    public Transaction() {
        this(DSL.name("transaction"), null);
    }

    public <O extends Record> Transaction(Table<O> child, ForeignKey<O, TransactionRecord> key) {
        super(child, key, TRANSACTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<TransactionRecord> getPrimaryKey() {
        return Keys.PK_TRANSACTION;
    }

    @Override
    public List<ForeignKey<TransactionRecord, ?>> getReferences() {
        return Arrays.asList(Keys.TRANSACTION__FK_ACCOUNT_ON_TRANSACTION);
    }

    private transient Account _account;

    /**
     * Get the implicit join path to the <code>public.account</code> table.
     */
    public Account account() {
        if (_account == null)
            _account = new Account(this, Keys.TRANSACTION__FK_ACCOUNT_ON_TRANSACTION);

        return _account;
    }

    @Override
    public Transaction as(String alias) {
        return new Transaction(DSL.name(alias), this);
    }

    @Override
    public Transaction as(Name alias) {
        return new Transaction(alias, this);
    }

    @Override
    public Transaction as(Table<?> alias) {
        return new Transaction(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Transaction rename(String name) {
        return new Transaction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Transaction rename(Name name) {
        return new Transaction(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Transaction rename(Table<?> name) {
        return new Transaction(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, UUID, BigDecimal, String, String, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super UUID, ? super UUID, ? super BigDecimal, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super UUID, ? super UUID, ? super BigDecimal, ? super String, ? super String, ? super LocalDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
