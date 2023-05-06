/*
 * This file is generated by jOOQ.
 */
package com.bankxz.backend.generated;


import com.bankxz.backend.generated.tables.Account;
import com.bankxz.backend.generated.tables.Address;
import com.bankxz.backend.generated.tables.Databasechangeloglock;
import com.bankxz.backend.generated.tables.Phone;
import com.bankxz.backend.generated.tables.Transaction;
import com.bankxz.backend.generated.tables.User;
import com.bankxz.backend.generated.tables.records.AccountRecord;
import com.bankxz.backend.generated.tables.records.AddressRecord;
import com.bankxz.backend.generated.tables.records.DatabasechangeloglockRecord;
import com.bankxz.backend.generated.tables.records.PhoneRecord;
import com.bankxz.backend.generated.tables.records.TransactionRecord;
import com.bankxz.backend.generated.tables.records.UserRecord;

import org.jooq.ForeignKey;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AccountRecord> PK_ACCOUNT = Internal.createUniqueKey(Account.ACCOUNT, DSL.name("pk_account"), new TableField[] { Account.ACCOUNT.ID }, true);
    public static final UniqueKey<AddressRecord> PK_ADDRESS = Internal.createUniqueKey(Address.ADDRESS, DSL.name("pk_address"), new TableField[] { Address.ADDRESS.ID }, true);
    public static final UniqueKey<DatabasechangeloglockRecord> DATABASECHANGELOGLOCK_PKEY = Internal.createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, DSL.name("databasechangeloglock_pkey"), new TableField[] { Databasechangeloglock.DATABASECHANGELOGLOCK.ID }, true);
    public static final UniqueKey<PhoneRecord> PK_PHONE = Internal.createUniqueKey(Phone.PHONE, DSL.name("pk_phone"), new TableField[] { Phone.PHONE.ID }, true);
    public static final UniqueKey<TransactionRecord> PK_TRANSACTION = Internal.createUniqueKey(Transaction.TRANSACTION, DSL.name("pk_transaction"), new TableField[] { Transaction.TRANSACTION.ID }, true);
    public static final UniqueKey<UserRecord> PK_USER = Internal.createUniqueKey(User.USER, DSL.name("pk_user"), new TableField[] { User.USER.ID }, true);
    public static final UniqueKey<UserRecord> UC_USER_EMAIL = Internal.createUniqueKey(User.USER, DSL.name("uc_user_email"), new TableField[] { User.USER.EMAIL }, true);

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<AccountRecord, UserRecord> ACCOUNT__FK_USER_ON_ACCOUNT = Internal.createForeignKey(Account.ACCOUNT, DSL.name("fk_user_on_account"), new TableField[] { Account.ACCOUNT.USER_ID }, Keys.PK_USER, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<AddressRecord, UserRecord> ADDRESS__FK_USER_ON_ADDRESS = Internal.createForeignKey(Address.ADDRESS, DSL.name("fk_user_on_address"), new TableField[] { Address.ADDRESS.USER_ID }, Keys.PK_USER, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<PhoneRecord, UserRecord> PHONE__FK_USER_ON_PHONE = Internal.createForeignKey(Phone.PHONE, DSL.name("fk_user_on_phone"), new TableField[] { Phone.PHONE.USER_ID }, Keys.PK_USER, new TableField[] { User.USER.ID }, true);
    public static final ForeignKey<TransactionRecord, AccountRecord> TRANSACTION__FK_ACCOUNT_ON_TRANSACTION = Internal.createForeignKey(Transaction.TRANSACTION, DSL.name("fk_account_on_transaction"), new TableField[] { Transaction.TRANSACTION.ACCOUNT_ID }, Keys.PK_ACCOUNT, new TableField[] { Account.ACCOUNT.ID }, true);
}
