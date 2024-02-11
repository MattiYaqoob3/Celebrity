package com.celebrityApp.celebrity_api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.xml.crypto.Data;

@Document(collection = "user")

public class Users {
    @Id
    private String id;


    private String username;


    private String password;


    private String age;


    private String email;


    private String gender;


    private String photo;


    private String reviews_grade;


    private String firstname;


    private String lastname;



}
