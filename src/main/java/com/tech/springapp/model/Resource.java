package com.tech.springapp.model;

import com.tech.springapp.model.dto.ResourceDto;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private Category category;

    public static Resource from(ResourceDto resourceDto) {
        Resource resource = new Resource();
        resource.setName(resourceDto.getName());
        return resource;
    }
}
