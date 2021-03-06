package com.tech.springapp.model.dto;

import com.tech.springapp.model.Resource;
import lombok.Data;

import java.util.Objects;

@Data
public class ResourceDto {

    private Long id;
    private String name;
    private PlainCategoryDto plainCategoryDto;

    public static ResourceDto from(Resource resource) {
        ResourceDto resourceDto = new ResourceDto();
        resourceDto.setId(resource.getId());
        resourceDto.setName(resource.getName());
        if (Objects.nonNull(resource.getCategory())) {
            resourceDto.setPlainCategoryDto(PlainCategoryDto.from(resource.getCategory()));
        }
        return resourceDto;
    }


}
