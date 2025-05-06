package com.jwtauthentication.HospitalSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwtauthentication.HospitalSystem.dto.AuthRequest;
import com.jwtauthentication.HospitalSystem.dto.AuthResponse;
import com.jwtauthentication.HospitalSystem.dto.RegisterRequest;
import com.jwtauthentication.HospitalSystem.model.User;
import com.jwtauthentication.HospitalSystem.service.AuthService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest register) {
        User user = new User();
        user.setEmail(register.getEmail());
        user.setName(register.getName());
        user.setPassword(register.getPassword());
        user.setRole(register.getRole());
        return authService.register(user);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest authRequest) {
        return authService.login(authRequest);
    }

}
