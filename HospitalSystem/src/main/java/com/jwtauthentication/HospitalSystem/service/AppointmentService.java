package com.jwtauthentication.HospitalSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwtauthentication.HospitalSystem.model.Appointments;
import com.jwtauthentication.HospitalSystem.model.Doctor;
import com.jwtauthentication.HospitalSystem.model.Patient;
import com.jwtauthentication.HospitalSystem.repository.AppointmentRepo;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepo appointmentRepo;

    // Get all appointment for doctor
    public Doctor getDoctor(Doctor doctor) {
        return appointmentRepo.findByDoctor(doctor);
    }

    // Get all appointment for patient
    public Patient getPatient(Patient patient) {
        return appointmentRepo.findByPatient(patient);
    }

    // Book new appointment
    public Appointments booAppointments(Appointments appointments) {
        return appointmentRepo.save(appointments);
    }

}
