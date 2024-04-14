package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ResourceNotFoundException extends  RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);
    }

    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public static class ResourceNotFoundException1 extends RuntimeException
    {
        public ResourceNotFoundException1(String fullstack,Object... args) {
            super(String.format(fullstack, args));
        }
    }
}
