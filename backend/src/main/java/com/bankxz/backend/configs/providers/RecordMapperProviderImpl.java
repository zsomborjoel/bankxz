package com.bankxz.backend.configs.providers;

import com.bankxz.backend.pojos.Account;
import org.jooq.Record;
import org.jooq.RecordMapper;
import org.jooq.RecordMapperProvider;
import org.jooq.RecordType;
import org.jooq.impl.DefaultRecordMapper;

public class RecordMapperProviderImpl implements RecordMapperProvider {

    @Override
    public <R extends Record, E> RecordMapper<R, E> provide(RecordType<R> recordType, Class<? extends E> type) {
        if (type == Account.class) {
            return (RecordMapper<R, E>) new AccountRecordMapper();
        }
        return new DefaultRecordMapper(recordType, type);
    }

}
