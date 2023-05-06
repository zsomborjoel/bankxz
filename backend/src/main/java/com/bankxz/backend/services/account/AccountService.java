package com.bankxz.backend.services.account;

import com.bankxz.backend.pojos.Account;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Account findById(final UUID id) {
        return accountRepository.findById(id);
    }

}
