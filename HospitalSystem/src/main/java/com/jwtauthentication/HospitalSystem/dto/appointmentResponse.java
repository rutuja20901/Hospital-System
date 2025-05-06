package com.jwtauthentication.HospitalSystem.dto;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class appointmentResponse {
    private long appointmentId;
    private String doctorName;
    private String patientName;
    private LocalDateTime appointmentTime;

}
