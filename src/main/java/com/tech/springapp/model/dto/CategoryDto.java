package com.tech.springapp.model.dto;

import com.tech.springapp.model.Category;
import com.tech.springapp.model.Resource;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CategoryDto {

    private Long id;
    private String name;
    private List<ResourceDto> resourcesDto = new ArrayList<>();

    public static CategoryDto from(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(categoryDto.getId());
        categoryDto.setName(category.getName());
        categoryDto.setResourcesDto(category.getResources().stream().map(ResourceDto::from).collect(Collectors.toList()));
        return categoryDto;
    }
}
