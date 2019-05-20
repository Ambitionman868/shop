package com.tonic.wx.controller;


import com.tonic.core.util.ResponseUtil;
import com.tonic.db.domain.Address;
import com.tonic.db.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户服务
 */
@RestController
@RequestMapping("/wx/user")
@Slf4j
public class WxUserController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/list")
    public ResponseUtil list(Integer userId) {
        if (userId == null) return ResponseUtil.unlogin();

        List<Address> addresses = addressService.findAllById(userId);
        return ResponseUtil.success(addresses);
    }


}
