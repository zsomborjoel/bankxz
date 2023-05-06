package com.bankxz.backend.services.user;

import com.bankxz.backend.generated.tables.records.UserRecord;
import com.bankxz.backend.services.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.*;

import static com.bankxz.backend.generated.Tables.USER;

@Repository
@RequiredArgsConstructor
public class UserRepository implements BaseRepository<UserRecord, UUID> {

    private final DSLContext create;

    @Override
    public UserRecord findById(UUID uuid) {
        return create
                .selectFrom(USER)
                .where(USER.ID.eq(uuid))
                .fetchOne();
    }

    @Override
    public List<UserRecord> findAll() {
        return create
                .selectFrom(USER)
                .fetchInto(UserRecord.class);
    }

    @Override
    public Integer insert(UserRecord value) {
        value.setId(UUID.randomUUID());
        return create.insertInto(USER).values(value).execute();
    }

    @Override
    public Integer batchInsert(List<UserRecord> values) {
        values.forEach(v -> v.setId(UUID.randomUUID()));
        return create.insertInto(USER).values(values).execute();
    }
}
