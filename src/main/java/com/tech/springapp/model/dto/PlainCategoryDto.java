package com.tech.springapp.model.dto;

import com.tech.springapp.model.Category;
import lombok.Data;

@Data
public class PlainCategoryDto {
    private Long id;
    private String name;

    public static PlainCategoryDto from(Category category) {
        PlainCategoryDto plainCategoryDto = new PlainCategoryDto();
        plainCategoryDto.setId(category.getId());
        plainCategoryDto.setName(category.getName());
        return plainCategoryDto;
    }
}
