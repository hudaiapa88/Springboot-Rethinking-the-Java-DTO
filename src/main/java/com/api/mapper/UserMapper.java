package com.api.mapper;

import com.api.model.dto.UserDto;
import com.api.model.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
    public  interface  UserMapper  extends  BaseMapper<UserDto.Response.User.Public,User> {
}
