package com.tonic.db.dao;

import com.tonic.db.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Integer, Address> {

    List<Address> findAllById(Integer id);
}
