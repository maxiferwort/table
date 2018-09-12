package com.example.table.repository;

import com.example.table.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRespository extends JpaRepository<Address, Long> {

}
