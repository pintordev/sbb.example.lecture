package com.example.lecture;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "entity not found")
public class DataNotFoundException extends RuntimeException {
    private static final long serialVerstionUID = 1L;
    public DataNotFoundException(String message) {
        super(message);
    }
}
