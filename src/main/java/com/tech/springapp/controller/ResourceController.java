package com.tech.springapp.controller;

import com.tech.springapp.model.Resource;
import com.tech.springapp.model.dto.ResourceDto;
import com.tech.springapp.service.ResourceService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources")
public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }
    //DTO stands for DATA TRANSFER OBJECT
    @PostMapping
    public ResponseEntity<ResourceDto> addResource(@RequestBody final ResourceDto resourceDto) {
        Resource resource = resourceService.addResource(Resource.from(resourceDto));
        return new ResponseEntity<>(ResourceDto.from(resource), HttpStatus.OK);
    }
}
