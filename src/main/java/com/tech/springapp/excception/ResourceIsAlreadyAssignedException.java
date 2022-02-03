package com.tech.springapp.excception;

import java.text.MessageFormat;

public class ResourceIsAlreadyAssignedException extends RuntimeException{

    public ResourceIsAlreadyAssignedException(final Long resourceId, final Long categoryId) {
        super(MessageFormat.format("Item: {0} is already assigned to card: {1}", resourceId, categoryId));
    }

}
