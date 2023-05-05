/*
 * This file is generated by jOOQ.
 */
package com.bankxz.backend.generated.tables;


import com.bankxz.backend.generated.Keys;
import com.bankxz.backend.generated.Public;
import com.bankxz.backend.generated.tables.records.PhoneRecord;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
public class Phone extends TableImpl<PhoneRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.phone</code>
     */
    public static final Phone PHONE = new Phone();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PhoneRecord> getRecordType() {
        return PhoneRecord.class;
    }

    /**
     * The column <code>public.phone.id</code>.
     */
    public final TableField<PhoneRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.phone.number</code>.
     */
    public final TableField<PhoneRecord, String> NUMBER = createField(DSL.name("number"), SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>public.phone.user_id</code>.
     */
    public final TableField<PhoneRecord, UUID> USER_ID = createField(DSL.name("user_id"), SQLDataType.UUID, this, "");

    private Phone(Name alias, Table<PhoneRecord> aliased) {
        this(alias, aliased, null);
    }

    private Phone(Name alias, Table<PhoneRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.phone</code> table reference
     */
    public Phone(String alias) {
        this(DSL.name(alias), PHONE);
    }

    /**
     * Create an aliased <code>public.phone</code> table reference
     */
    public Phone(Name alias) {
        this(alias, PHONE);
    }

    /**
     * Create a <code>public.phone</code> table reference
     */
    public Phone() {
        this(DSL.name("phone"), null);
    }

    public <O extends Record> Phone(Table<O> child, ForeignKey<O, PhoneRecord> key) {
        super(child, key, PHONE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<PhoneRecord> getPrimaryKey() {
        return Keys.PK_PHONE;
    }

    @Override
    public List<ForeignKey<PhoneRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PHONE__FK_USER_ON_PHONE);
    }

    private transient User _user;

    /**
     * Get the implicit join path to the <code>public.user</code> table.
     */
    public User user() {
        if (_user == null)
            _user = new User(this, Keys.PHONE__FK_USER_ON_PHONE);

        return _user;
    }

    @Override
    public Phone as(String alias) {
        return new Phone(DSL.name(alias), this);
    }

    @Override
    public Phone as(Name alias) {
        return new Phone(alias, this);
    }

    @Override
    public Phone as(Table<?> alias) {
        return new Phone(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Phone rename(String name) {
        return new Phone(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Phone rename(Name name) {
        return new Phone(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Phone rename(Table<?> name) {
        return new Phone(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<UUID, String, UUID> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super UUID, ? super String, ? super UUID, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super UUID, ? super String, ? super UUID, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
