package com.tech.springapp.excception;

import java.text.MessageFormat;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Long id) {
        super(MessageFormat.format("Could not find resource with id: {0}", id));
    }
}
