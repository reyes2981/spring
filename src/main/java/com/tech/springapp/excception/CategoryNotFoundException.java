package com.tech.springapp.excception;

import java.text.MessageFormat;

public class CategoryNotFoundException extends RuntimeException {

    public CategoryNotFoundException(final Long id) {
        super(MessageFormat.format("Could not find category with id: {0}", id));
    }
}
