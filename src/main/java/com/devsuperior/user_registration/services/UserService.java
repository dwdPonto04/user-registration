package com.devsuperior.user_registration.services;
import com.devsuperior.user_registration.dto.UserDTO;
import com.devsuperior.user_registration.repositories.UserRepository;
import com.devsuperior.user_registration.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public UserDTO findById(Long id){
       User entity = userRepository.findById(id).get();
       UserDTO dto = new UserDTO(entity);
       return dto;
    }



}
