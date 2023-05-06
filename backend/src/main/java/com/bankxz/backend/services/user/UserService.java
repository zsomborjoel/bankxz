package com.bankxz.backend.services.user;

import com.bankxz.backend.generated.tables.records.UserRecord;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserRecord findById(final UUID id) {
        return userRepository.findById(id);
    }

    public List<UserRecord> findAll() {
        return userRepository.findAll();
    }

    public UUID insert(final UserRecord user) {
        userRepository.insert(user);
        log.info("User has been saved | [{}]", user);
        return user.getId();
    }

    public void batchInsert(final List<UserRecord> users) {
        userRepository.batchInsert(users);
        log.info("This many users has been bulk saved | [{}]", users.size());
    }

}
