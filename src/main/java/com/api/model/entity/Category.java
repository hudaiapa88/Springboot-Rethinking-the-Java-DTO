package com.api.model.entity;

import com.api.model.dto.CategoryDto;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Category extends BaseEntity{

   private String name;

   @OneToMany(mappedBy = "category", cascade = CascadeType.PERSIST,fetch = FetchType.LAZY)
   List<Product> products;


   public static Category create(CategoryDto.Request.Save save){
      Category category= new Category();
      category.setName(save.getName());
      return category;
   }
}
