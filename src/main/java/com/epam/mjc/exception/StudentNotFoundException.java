package com.epam.mjc.exception;

public class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, Throwable cause) {
        super(message,cause);
    }
}
