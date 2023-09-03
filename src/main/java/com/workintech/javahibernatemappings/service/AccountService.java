package com.workintech.javahibernatemappings.service;

import com.workintech.javahibernatemappings.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account find(int id);
    Account save(Account account);
    void delete(Account account);
}
