package com.flowershop.dto;

import javax.validation.constraints.NotBlank;

public class LoginRequestDTO {

    @NotBlank(message = "Username cannot be null.")
    private String username;

    @NotBlank(message = "Password cannot be null.")
    private String password;


    public LoginRequestDTO() {
    }

    public LoginRequestDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
