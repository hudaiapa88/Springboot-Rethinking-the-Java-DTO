package com.api.model.enums;

public enum UserType {

    SELLER(Values.SELLER),
    CUSTOMER(Values.CUSTOMER);


    private UserType(String value) {
        if (!this.name().equals(value))
            throw new IllegalArgumentException("Incorrect use of AdvertisementType");
    }
    public static class Values {
        public static final String SELLER= "SELLER";
        public static final String CUSTOMER= "CUSTOMER";
    }
}
