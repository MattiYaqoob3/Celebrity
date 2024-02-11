package com.celebrityApp.celebrity_api.controllers;

import com.celebrityApp.celebrity_api.models.Users;
import com.celebrityApp.celebrity_api.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserControllers {

    @Autowired
    UserServices userServices;

    @PatchMapping("/add")
    public Users createuser(@RequestBody Users users){
        return userServices.createuser(users);
    }


    @GetMapping("/find/{id}")
    public Users findone(@PathVariable String id){
        return userServices.findone(id);
    }

    @GetMapping("/find")
    public List<Users> findallusers(){
        return userServices.findallusers();
    }

    @PutMapping("/update/{id}")
    public Users updateuser(@RequestBody Users users, @PathVariable("id") String _id){
        return userServices.updateuser(users);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteuser(@PathVariable String id){
        return userServices.deleteuser(id);
    }




}
