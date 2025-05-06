package com.jwtauthentication.HospitalSystem.dto;

import com.jwtauthentication.HospitalSystem.model.Role;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisterRequest {
    private String name;
    private String email;
    private String password;
    private Role role;

}
