package com.tonic.wx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.tonic.db","com.tonic.core","com.tonic.wx"})
public class WxApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxApiApplication.class, args);
    }

}
