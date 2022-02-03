package com.tech.springapp.model;

import com.tech.springapp.model.dto.ResourceDto;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "resouorces")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String serialNumber;

    public Resource() {
    }

    public static Resource from(ResourceDto resourceDto) {
        Resource resource = new Resource();
        resource.setSerialNumber(resourceDto.getSerialNumber());
        return resource;
    }
}
