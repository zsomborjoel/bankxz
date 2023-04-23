package com.bankxz.backend.services.user;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserJooqRepository {

    private final DSLContext create;

    public Result<Record> getUser() {
        //return create.select().from(USER).fetch();
        return null;
    }

}
