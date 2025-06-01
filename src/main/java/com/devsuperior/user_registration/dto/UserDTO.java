package com.devsuperior.user_registration.dto;

import com.devsuperior.user_registration.entities.User;

public class UserDTO {

    private Long id;
    private String nome;

    public UserDTO(){

    }

    public UserDTO(Long id, String nome) {
        id = id;
        this.nome = nome;
    }

    public UserDTO(User user) {
        id = user.getId();
        nome = user.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
