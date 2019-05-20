package com.tonic.db.service.impl;

import com.tonic.db.dao.AddressRepository;
import com.tonic.db.domain.Address;
import com.tonic.db.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> findAllById(Integer id) {
        return addressRepository.findAllById(id);
    }
}
