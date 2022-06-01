package com.api.model.entity;

import com.api.model.enums.UserType;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@Data
@DiscriminatorValue(value = UserType.Values.SELLER)
public class Seller extends User{
    private String taxNo;
    private String shopName;
}
