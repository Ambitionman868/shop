package com.tonic.db.domain;

import lombok.Data;

import javax.persistence.Entity;
import java.time.LocalDateTime;


@Entity
@Data
public class Address {
    public static final Boolean NOT_DELETED = false;

    public static final Boolean IS_DELETED = true;

    private Integer id;

    private String name;

    private Integer userId;

    private String province;

    private String city;

    private String county;

    private String addressDetail;

    private String areaCode;

    private String postalCode;

    private String tel;

    private Boolean isDefault;

    private LocalDateTime addTime;

    private LocalDateTime updateTime;

    private Boolean deleted;


    public void andLogicalDeleted(boolean deleted) {
        setDeleted(deleted ? IS_DELETED : NOT_DELETED);
    }

}