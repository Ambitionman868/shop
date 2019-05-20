package com.tonic.db.service;

import com.tonic.db.domain.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAllById(Integer id);
}
