package com.api.controller;

import com.api.business.UserManager;
import com.api.model.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserManager userManager;

    @GetMapping
    public <T extends UserDto.Response.User.Public>  List<T> getAll(){
        return userManager.getAll();
    }

}
