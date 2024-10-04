package com.apilogin.demo.exception;

public class InvalidUserException extends RuntimeException {
    public InvalidUserException(String message) {
        super(message);
    }

    public InvalidUserException() {
        super("Infelizmente este usuário não foi encontrado.");
    }
    
}
