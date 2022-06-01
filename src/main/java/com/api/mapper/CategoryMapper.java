package com.api.mapper;

import com.api.model.dto.CategoryDto;
import com.api.model.entity.Category;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoryMapper extends BaseMapper<CategoryDto.Response.Public, Category>{
}
