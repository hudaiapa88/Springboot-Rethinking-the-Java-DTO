package com.api.model.dto;


import lombok.*;
import lombok.experimental.NonFinal;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

public enum ProductDto {;
    private interface Id { @Positive Long getId(); }
    private interface Name { @NotBlank String getName(); }
    private interface Price { @Positive Double getPrice(); }
    private interface Cost { @Positive Double getCost(); }
    private interface Category { CategoryDto.Response.Public getCategory(); }

    public enum Request{;

       @Value
        public static class Create implements Name, Price, Cost {
            String name;
            Double price;
            Double cost;
        }
    }

    public enum Response{;
        @Value
       public static class Public implements Id, Name, Price{
            Long id;
            String name;
            Double price;
       }
        @Value
        public static class PublicWithoutCategory implements Id, Name, Price,Cost{
            Long id;
            String name;
            Double price;
            Double cost;
        }
        @Data
        @NonFinal
        public static class Minimal implements Id, Name, Price{
            Long id;
            String name;
            Double price;

        }

       @Value
        public static class Simple extends Minimal implements Category {
            CategoryDto.Response.Public category;
        }
        @Value
        public static class Private implements Id, Name, Price, Cost {
            Long id;
            String name;
            Double price;
            Double cost;
            CategoryDto.Response.Private category;
        }
    }
}
