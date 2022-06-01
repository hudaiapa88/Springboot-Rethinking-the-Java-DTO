package com.api.model.entity;

import com.api.model.enums.UserType;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "userType", discriminatorType= DiscriminatorType.STRING)
public class User extends BaseEntity{
   private String username;
   private String mail;
   private String password;

   @Column(name = "UserType",nullable = false, insertable = false, updatable = false)
   @Enumerated(value = EnumType.STRING)
   private UserType userType;
}
