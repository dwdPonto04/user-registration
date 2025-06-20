package com.devsuperior.user_registration.repositories;

import com.devsuperior.user_registration.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
