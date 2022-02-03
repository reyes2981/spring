package com.tech.springapp.controller;

import com.tech.springapp.model.Resource;
import com.tech.springapp.model.dto.ResourceDto;
import com.tech.springapp.service.ResourceService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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

    @GetMapping
    public  ResponseEntity<List<ResourceDto>> getResources() {
        List<Resource> resources = resourceService.getResources();
        List<ResourceDto> resourceDto = resources.stream().map(ResourceDto::from).collect(Collectors.toList());
        return new ResponseEntity<>(resourceDto, HttpStatus.OK);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<ResourceDto> getResource(@PathVariable final Long id) {
        Resource resource = resourceService.getResource(id);
        return new ResponseEntity<>(ResourceDto.from(resource), HttpStatus.OK);
    }


}
