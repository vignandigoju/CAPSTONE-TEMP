package com.example.loginControlService.dto;


public class AuthRequest {

    private String email ;
    private String password;

    public String getEmail() {
        return email;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public AuthRequest() {
    }
}