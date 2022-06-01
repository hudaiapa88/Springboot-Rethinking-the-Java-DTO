package com.api.controller;

import com.api.business.ProductManager;
import com.api.model.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductManager productManager;
    @GetMapping
    public List<ProductDto.Response.Public> getAll(){
        return productManager.gelAll();
    }
    @GetMapping("/simple")
    public List<ProductDto.Response.Simple> getAllSimple(){
        return productManager.getAllSimple();
    }
}
