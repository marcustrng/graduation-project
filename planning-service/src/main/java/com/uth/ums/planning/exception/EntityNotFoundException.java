package com.uth.ums.planning.exception;

public class EntityNotFoundException extends GlobalException {
    public EntityNotFoundException() {
        super("Requested entity not present in the DB.", GlobalErrorCode.ERROR_ENTITY_NOT_FOUND);
    }

    public EntityNotFoundException (String message) {
        super(message, GlobalErrorCode.ERROR_ENTITY_NOT_FOUND);
    }
}
