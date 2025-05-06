package com.jwtauthentication.HospitalSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jwtauthentication.HospitalSystem.dto.AuthRequest;
import com.jwtauthentication.HospitalSystem.dto.AuthResponse;
import com.jwtauthentication.HospitalSystem.model.User;
import com.jwtauthentication.HospitalSystem.repository.UserRepo;
import com.jwtauthentication.HospitalSystem.security.JwtUtil;

@Service
public class AuthService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    // Register user
    public String register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepo.save(user);
        return "User register successfully";
    }

    // Login user
    public AuthResponse login(AuthRequest authRequest) {
        User user = userRepo.findByEmail(authRequest.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found!"));

        if (!passwordEncoder.matches(authRequest.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid Credentials!");
        }

        String jwt = jwtUtil.generateToken(user);
        return new AuthResponse(jwt);

        // return jwtUtil.generateToken(user);

    }

}
