package com.celebrityApp.celebrity_api.services;

import com.celebrityApp.celebrity_api.DTO.user.CreateUserDTO;
import com.celebrityApp.celebrity_api.models.Users;
import com.celebrityApp.celebrity_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {


    @Autowired
    UserRepository userRepository;

    public Users createuser (CreateUserDTO createUserDTO){
        Users users = new Users(); // this user is from models

        users.setUsername(createUserDTO.getUsername());
        users.setUsername(createUserDTO.getUsername());
        users.setPassword(createUserDTO.getPassword());
        users.setDateOfBirth(createUserDTO.getDateOfBirth());
        users.setEmail(createUserDTO.getEmail());
        users.setFirstName(createUserDTO.getFirstName());
        users.setLastName(createUserDTO.getLastName());
        users.setAdress_city(createUserDTO.getAdress_city());
        users.setAdress_street(createUserDTO.getAdress_street());
        users.setAdress_postalCode(createUserDTO.getAdress_postalCode());

        return userRepository.save(users);
    }


}
