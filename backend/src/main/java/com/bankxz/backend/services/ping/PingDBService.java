package com.bankxz.backend.services.ping;

import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PingDBService {

    private final DSLContext create;

    public void pingDB() {
        create.fetch("SELECT 1");
    }

}
