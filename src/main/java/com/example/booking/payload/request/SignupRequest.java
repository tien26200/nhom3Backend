package com.example.booking.payload.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class SignupRequest {

    private String username;


    private String email;

    private Set<String> role;


    private String password;


}
