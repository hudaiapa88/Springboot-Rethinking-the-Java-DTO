package com.api.model.dto;

import com.api.model.enums.UserType;
import lombok.*;
import lombok.experimental.NonFinal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.List;

public enum UserDto {;
    private interface Id { @Positive Long getId(); }
    private interface Username { @NotBlank String getUsername(); }
    private interface Mail { @Positive String getMail(); }
    private interface Password { @Positive String getPassword(); }
    private interface UserType { com.api.model.enums.UserType getUserType(); }
    private interface TaxNo { @NotBlank String getTaxNo(); }
    private interface ShopName { @Positive String getShopName(); }
    private interface Phone { @Positive String getPhone(); }
    private interface Balance { BigDecimal getBalance(); }

    public enum Request{;


    }

    public enum Response{;

        public enum Seller {;
            @Value
            public static class Public extends User.Public implements ShopName {
                private String shopName;
            }
            @Value
            public static class Private extends User.Public implements ShopName {
                private String shopName;
            }


        }
        public enum Customer {;
            @Value
            public static class Public extends User.Public implements Phone  {
                private String phone;
            }
            @Value
            public static class Private extends User.Public implements Phone  {
                private String phone;
            }


        }

        public enum User {;
            @Data
            @NonFinal
            public static class Public implements Username,Mail, UserDto.UserType {
                private String username;
                private String mail;
                private com.api.model.enums.UserType userType;
            }
            @Value
            public static class Private implements Username,Mail, UserDto.UserType {
                private String username;
                private String mail;
                private com.api.model.enums.UserType userType;
            }


        }

    }

}
