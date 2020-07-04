package com.example.JwtSpringSecurity.models;

public class Payload {
    private String jwt;

    public Payload(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
