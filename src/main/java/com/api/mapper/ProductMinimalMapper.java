package com.api.mapper;

import com.api.model.dto.ProductDto;
import com.api.model.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMinimalMapper extends BaseMapper<ProductDto.Response.Minimal, Product>{
}
