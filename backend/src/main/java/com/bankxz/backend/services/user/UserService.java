package com.bankxz.backend.services.user;

import com.bankxz.backend.generated.tables.daos.UserDao;
import com.bankxz.backend.generated.tables.pojos.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDao userDao;

    public User getById(final UUID id) {
        return userDao.findById(id);
    }

    public List<User> getAll() {
        return userDao.findAll();
    }

    public UUID save(final User user) {
        userDao.insert(user);
        log.info("User has been saved | [{}]", user);
        return user.getId();
    }

    public void saveAll(final List<User> users) {
        userDao.insert(users);
        log.info("This many users has been bulk saved | [{}]", users.size());
    }

}
