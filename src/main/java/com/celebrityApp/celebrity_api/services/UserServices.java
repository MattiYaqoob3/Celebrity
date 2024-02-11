package com.celebrityApp.celebrity_api.services;

import com.celebrityApp.celebrity_api.models.Users;
import com.celebrityApp.celebrity_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServices {
    @Autowired
    UserRepository userRepository;


    public Users createuser(Users users){
        return userRepository.save(users);
    }

    public List<Users> findallusers(){
        return userRepository.findAll();
    }

    public Users findone(String id){
        return userRepository.findById(id).get();
    }

    public Users updateuser (Users users){
        return userRepository.save(users);
    }


    public String deleteuser(String id){
        userRepository.deleteById(id);
        return "Deleted successfully!";
    }


}
