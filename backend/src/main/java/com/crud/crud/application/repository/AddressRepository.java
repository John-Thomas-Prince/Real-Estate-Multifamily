package com.crud.crud.application.repository;


import com.crud.crud.application.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AddressRepository extends JpaRepository<Address,Long> {
}

