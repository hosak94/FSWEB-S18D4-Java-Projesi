package com.workintech.javahibernatemappings.repository;

import com.workintech.javahibernatemappings.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
