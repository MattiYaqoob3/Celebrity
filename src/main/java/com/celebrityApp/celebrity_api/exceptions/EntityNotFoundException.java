package com.celebrityApp.celebrity_api.exceptions;

public class EntityNotFoundException extends  RuntimeException{
    public EntityNotFoundException(String message){
        super(message);
    }
}
