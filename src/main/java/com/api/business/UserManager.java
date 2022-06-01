package com.api.business;

import com.api.mapper.CustomerMapper;
import com.api.mapper.SellerMapper;
import com.api.model.dto.UserDto;
import com.api.model.entity.Customer;
import com.api.model.entity.Seller;
import com.api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserManager {
    private final UserRepository userRepository;
    private final SellerMapper sellerMapper;
    private final CustomerMapper customerMapper;
    public <T extends UserDto.Response.User.Public> List<T> getAll(){
        List<UserDto.Response.User.Public> userDtoList = new ArrayList<>();
        userRepository.findAll().stream().forEach((user)->{
            UserDto.Response.User.Public userDto =new UserDto.Response.User.Public();

          //  userDto = user instanceof Seller ? sellerMapper.entityToDto((Seller) user) :user instanceof Customer ? customerMapper.entityToDto((Customer) user):null;

          if (user instanceof Seller){

             userDto =sellerMapper.entityToDto((Seller) user);
            }
            if (user instanceof Customer)
            {
                userDto = customerMapper.entityToDto((Customer) user);
            }
            userDtoList.add(userDto);
        });

        return (List<T>) userDtoList;
    }
}
