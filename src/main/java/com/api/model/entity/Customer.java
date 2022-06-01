package com.api.model.entity;

import com.api.model.enums.UserType;
import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Data
@DiscriminatorValue(value = UserType.Values.CUSTOMER)
public class Customer extends User{
    private String phone;
    private BigDecimal balance;
}
