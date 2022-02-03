package com.tech.springapp.model.dto;

import com.tech.springapp.model.Resource;
import lombok.Data;

@Data
public class ResourceDto {
    private Long id;
    private String serialNumber;

    public static ResourceDto from(Resource resource) {
        ResourceDto resourceDto = new ResourceDto();
        resourceDto.setId(resource.getId());
        resourceDto.setSerialNumber(resource.getSerialNumber());
        return resourceDto;
    }


}
