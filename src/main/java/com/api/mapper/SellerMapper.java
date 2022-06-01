package com.api.mapper;

import com.api.model.dto.UserDto;
import com.api.model.entity.Seller;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SellerMapper extends BaseMapper<UserDto.Response.Seller.Public, Seller>{
}
