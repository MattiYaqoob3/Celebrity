package com.celebrityApp.celebrity_api.controllers;

import com.celebrityApp.celebrity_api.DTO.user.CreateUserDTO;
import com.celebrityApp.celebrity_api.services.UserServices;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserControllers {
    @Autowired
    private UserServices userServices;




    @PostMapping("/post")
    public ResponseEntity<?> createuser(@Valid @RequestBody CreateUserDTO createUserDTO){
        try {
            return ResponseEntity.ok(userServices.createuser(createUserDTO));
        }catch (EnumConstantNotPresentException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


}
