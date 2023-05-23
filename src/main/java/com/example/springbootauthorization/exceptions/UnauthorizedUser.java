package com.example.springbootauthorization.exceptions;

public class UnauthorizedUser extends RuntimeException{
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}
