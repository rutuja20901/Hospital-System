package com.jwtauthentication.HospitalSystem.dto;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AppointmentRequest {
    private long doctorId;
    private long patientId;
    private LocalDateTime appointmentTime;

}
