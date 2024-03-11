package com.celebrityApp.celebrity_api.models;

import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "user")
public class Users {

    @Id
    private String id;


    @NotBlank(message = "Username cannot be blank")
    private String username;
    @NotBlank(message = "password cannot be blank")
    private String password;
    //dateofbirth
    @NotBlank(message = "dateOfBirth cannot be blank")
    private String dateOfBirth;
    @NotBlank(message = "email cannot be blank")
    private String email;

    private String photo = "dummy.png";
    @NotBlank(message = "firstName cannot be blank")
    private String firstName;
    @NotBlank(message = "lastName cannot be blank")
    private String lastName;


    @NotBlank(message = "adress_street cannot be blank")
    private String adress_street;
    @NotBlank(message = "adress_postalcode cannot be blank")
    private String adress_postalCode;
    @NotBlank(message = "adress_city cannot be blank")
    private String adress_city;

    private double balance = 0d;

    private double grade = 0d;

    // Role








    public Users() {
    }

    public Users(String username, String password, String dateOfBirth, String email, String photo, String firstName, String lastName, String adress_street, String adress_postalCode, String adress_city, double balance, double grade) {
        this.username = username;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.photo = photo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress_street = adress_street;
        this.adress_postalCode = adress_postalCode;
        this.adress_city = adress_city;
        this.balance = balance;
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress_street() {
        return adress_street;
    }

    public void setAdress_street(String adress_street) {
        this.adress_street = adress_street;
    }

    public String getAdress_postalCode() {
        return adress_postalCode;
    }

    public void setAdress_postalCode(String adress_postalCode) {
        this.adress_postalCode = adress_postalCode;
    }

    public String getAdress_city() {
        return adress_city;
    }

    public void setAdress_city(String adress_city) {
        this.adress_city = adress_city;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
