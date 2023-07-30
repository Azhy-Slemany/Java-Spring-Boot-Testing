package com.example.restcrud.rest;

import org.springframework.http.HttpStatus;

public class StudentException extends RuntimeException{

    HttpStatus errorStatus;

    public StudentException(String message, HttpStatus errorStatus) {
        super(message);
        this.errorStatus = errorStatus;
    }

    public StudentException(String message, Throwable cause, HttpStatus errorStatus) {
        super(message, cause);
        this.errorStatus = errorStatus;
    }

    public StudentException(Throwable cause, HttpStatus errorStatus) {
        super(cause);
        this.errorStatus = errorStatus;
    }
}
