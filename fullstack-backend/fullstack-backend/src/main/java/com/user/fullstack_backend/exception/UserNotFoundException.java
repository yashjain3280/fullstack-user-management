package com.user.fullstack_backend.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(Long id){
        super("could not find ht id " +id);
    }


}
