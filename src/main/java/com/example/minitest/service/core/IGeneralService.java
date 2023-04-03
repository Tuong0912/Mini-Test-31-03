package com.example.minitest.service.core;

import java.util.List;

public interface IGeneralService<T> {
    List<T> findAll();

    T findById(Long var1);

    void save(T var1);

    void remove(Long var1);
}
