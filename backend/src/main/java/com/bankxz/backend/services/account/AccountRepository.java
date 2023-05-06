package com.bankxz.backend.services.account;

import com.bankxz.backend.pojos.Account;
import com.bankxz.backend.services.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

import static com.bankxz.backend.generated.Tables.ACCOUNT;

@Repository
@RequiredArgsConstructor
public class AccountRepository implements BaseRepository<Account, UUID> {

    private final DSLContext create;

    @Override
    public Account findById(UUID id) {
        return create
                .selectFrom(ACCOUNT)
                .where(ACCOUNT.ID.eq(id))
                .fetchOneInto(Account.class);
    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public Integer insert(Account value) {
        return null;
    }

    @Override
    public Integer batchInsert(List<Account> values) {
        return null;
    }

}
