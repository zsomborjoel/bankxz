/*
 * This file is generated by jOOQ.
 */
package com.bankxz.backend.generated.tables;


import com.bankxz.backend.generated.Keys;
import com.bankxz.backend.generated.Public;
import com.bankxz.backend.generated.tables.records.UserRecord;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
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
public class User extends TableImpl<UserRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.user</code>
     */
    public static final User USER = new User();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserRecord> getRecordType() {
        return UserRecord.class;
    }

    /**
     * The column <code>public.user.id</code>.
     */
    public final TableField<UserRecord, UUID> ID = createField(DSL.name("id"), SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>public.user.email</code>.
     */
    public final TableField<UserRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.user.first_name</code>.
     */
    public final TableField<UserRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.user.last_name</code>.
     */
    public final TableField<UserRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.user.mothers_name</code>.
     */
    public final TableField<UserRecord, String> MOTHERS_NAME = createField(DSL.name("mothers_name"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.user.tax_id</code>.
     */
    public final TableField<UserRecord, String> TAX_ID = createField(DSL.name("tax_id"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.user.social_security_number</code>.
     */
    public final TableField<UserRecord, String> SOCIAL_SECURITY_NUMBER = createField(DSL.name("social_security_number"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.user.date_of_birth</code>.
     */
    public final TableField<UserRecord, LocalDate> DATE_OF_BIRTH = createField(DSL.name("date_of_birth"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>public.user.place_of_birth</code>.
     */
    public final TableField<UserRecord, String> PLACE_OF_BIRTH = createField(DSL.name("place_of_birth"), SQLDataType.VARCHAR(255), this, "");

    private User(Name alias, Table<UserRecord> aliased) {
        this(alias, aliased, null);
    }

    private User(Name alias, Table<UserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.user</code> table reference
     */
    public User(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>public.user</code> table reference
     */
    public User(Name alias) {
        this(alias, USER);
    }

    /**
     * Create a <code>public.user</code> table reference
     */
    public User() {
        this(DSL.name("user"), null);
    }

    public <O extends Record> User(Table<O> child, ForeignKey<O, UserRecord> key) {
        super(child, key, USER);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<UserRecord> getPrimaryKey() {
        return Keys.PK_USER;
    }

    @Override
    public List<UniqueKey<UserRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.UC_USER_EMAIL);
    }

    @Override
    public User as(String alias) {
        return new User(DSL.name(alias), this);
    }

    @Override
    public User as(Name alias) {
        return new User(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(String name) {
        return new User(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public User rename(Name name) {
        return new User(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<UUID, String, String, String, String, String, String, LocalDate, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
