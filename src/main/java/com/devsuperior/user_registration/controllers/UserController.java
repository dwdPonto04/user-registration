package com.devsuperior.user_registration.controllers;

import com.devsuperior.user_registration.dto.UserDTO;
import com.devsuperior.user_registration.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/{id}")
    public UserDTO findById(@PathVariable Long id){

        return userService.findById(id);
    }

}
