package com.tech.springapp.service;

import com.tech.springapp.excception.ResourceNotFoundException;
import com.tech.springapp.model.Resource;
import com.tech.springapp.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class ResourceService {
    private final ResourceRepository resourceRepository;

    @Autowired
    public ResourceService(ResourceRepository resourceRepository) {
        this.resourceRepository = resourceRepository;
    }

    public Resource addResource(Resource resource) {
        return resourceRepository.save(resource);
    }

    public List<Resource> GetCategories() {
        return StreamSupport
                .stream(resourceRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    public Resource getResource(Long id) {
        return resourceRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException(id));
    }

    public Resource deleteResource(Long id) {
        Resource resource = getResource(id);
        resourceRepository.delete(resource);
        return resource;

    }
}
