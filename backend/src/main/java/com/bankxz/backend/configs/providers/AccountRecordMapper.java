package com.bankxz.backend.configs.providers;

import com.bankxz.backend.generated.tables.records.AccountRecord;
import com.bankxz.backend.pojos.Account;
import org.javamoney.moneta.Money;
import org.jooq.RecordMapper;

public class AccountRecordMapper implements RecordMapper<AccountRecord, Account> {

    @Override
    public Account map(AccountRecord accountRecord) {
        return Account.builder()
                .id(accountRecord.getId())
                .currentBalance(Money.of(accountRecord.getBalance(), accountRecord.getCurrency()))
                .openedAt(accountRecord.getOpenedAt())
                .build();
    }

}