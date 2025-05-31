package com.devsuperior.user_registration.services;

import com.devsuperior.user_registration.dto.UserDTO;
import com.devsuperior.user_registration.repositories.UserRepository;
import com.devsuperior.user_registration.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDTO findById(Long id){
       User entity = userRepository.findById(id).get();
       UserDTO dto = new UserDTO(entity);
       return dto;
    }



}
