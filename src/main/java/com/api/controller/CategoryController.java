package com.api.controller;

import com.api.business.CategoryManager;
import com.api.business.ProductManager;
import com.api.model.dto.CategoryDto;
import com.api.model.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryManager categoryManager;

    @GetMapping
    public List<CategoryDto.Response.Public> getAll(){
        return categoryManager.getAll();
    }

    @PostMapping
    public CategoryDto.Response.Public save(@Valid @RequestBody  CategoryDto.Request.Save save){
        return categoryManager.save(save);
    }
}
