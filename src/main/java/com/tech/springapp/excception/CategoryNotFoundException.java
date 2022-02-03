package com.tech.springapp.excception;

import java.text.MessageFormat;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(Long id) {
        super(MessageFormat.format("Could not find cart with id: {0}", id));
    }
}
