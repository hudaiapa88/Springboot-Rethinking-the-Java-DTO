package com.api.business;

import com.api.mapper.ProductMapper;
import com.api.mapper.ProductSimpleMapper;
import com.api.model.dto.ProductDto;
import com.api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductManager {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final ProductSimpleMapper productSimpleMapper;
    public List<ProductDto.Response.Public> gelAll(){
        return productMapper.entityListToDtoList(productRepository.findAll());
    }

    public List<ProductDto.Response.Simple> getAllSimple(){
        return productSimpleMapper.entityListToDtoList(productRepository.findAll());
    }
}
