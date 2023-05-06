package com.bankxz.backend.services;

import java.util.List;

public interface BaseRepository<T, ID> {
    T findById(ID id);
    List<T> findAll();
    Integer insert(T value);
    Integer batchInsert(List<T> values);
}
