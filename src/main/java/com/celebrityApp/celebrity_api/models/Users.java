package com.celebrityApp.celebrity_api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class Users {

    @Id
    private String id;

}
