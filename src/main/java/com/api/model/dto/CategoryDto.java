package com.api.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Value;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;

public enum CategoryDto {;
    private interface Id { @Positive Long getId(); }
    private interface Name {@NotEmpty @NotNull @NotBlank String getName(); }
    private interface Products {  List<ProductDto.Response.PublicWithoutCategory> getProducts(); }

    public enum Request{;

        @Getter
        @Setter
        @NoArgsConstructor
        public static class Save implements Name {
            String name;
        }
    }

    public enum Response{;
        @Value
        public static class Public implements Id, Name,Products {
            Long id;
            String name;
            List<ProductDto.Response.PublicWithoutCategory> products;
        }
        @Value
        public static class Private implements Id, Name {
            Long id;
            String name;
        }
    }
}
