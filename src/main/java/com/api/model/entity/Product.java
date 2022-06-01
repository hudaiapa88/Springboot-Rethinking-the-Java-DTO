package com.api.model.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Product extends BaseEntity{
    private String name;
    private Double price;
    private Double cost;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
}
