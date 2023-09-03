package com.workintech.javahibernatemappings.repository;

import com.workintech.javahibernatemappings.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Integer> {
}
