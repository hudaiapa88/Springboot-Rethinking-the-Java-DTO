package com.api.business;

import com.api.mapper.CategoryMapper;
import com.api.model.dto.CategoryDto;
import com.api.model.entity.Category;
import com.api.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CategoryManager {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    public List<CategoryDto.Response.Public> getAll(){
        return categoryMapper.entityListToDtoList(categoryRepository.findAll());
    }

    public CategoryDto.Response.Public save(CategoryDto.Request.Save save){
        return categoryMapper.entityToDto(categoryRepository.save(Category.create(save)));
    }
}
