package com.api.mapper;

import com.api.model.dto.UserDto;
import com.api.model.entity.Customer;
import com.api.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends BaseMapper<UserDto.Response.Customer.Public, Customer>{
}
