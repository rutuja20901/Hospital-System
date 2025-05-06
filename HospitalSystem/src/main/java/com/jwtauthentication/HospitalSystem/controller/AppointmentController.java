package com.jwtauthentication.HospitalSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwtauthentication.HospitalSystem.dto.AppointmentRequest;
import com.jwtauthentication.HospitalSystem.model.Appointments;
import com.jwtauthentication.HospitalSystem.model.Doctor;
import com.jwtauthentication.HospitalSystem.model.Patient;
import com.jwtauthentication.HospitalSystem.service.AppointmentService;
import com.jwtauthentication.HospitalSystem.service.DoctorService;
import com.jwtauthentication.HospitalSystem.service.PatientService;

@RestController
@RequestMapping("/api/appointment")
public class AppointmentController {

    @Autowired
    private DoctorService doctorService;

    @Autowired
    private PatientService patientService;

    @Autowired
    private AppointmentService appointmentService;

    // Book new appointment
    @PostMapping("/book")
    public Appointments book(@RequestBody AppointmentRequest app) {
        Doctor doctor = doctorService.getDoctorById(app.getDoctorId());
        Patient patient = patientService.getPatientById(app.getPatientId());

        Appointments appointment = new Appointments();
        appointment.setDoctor(doctor);
        appointment.setPatient(patient);
        appointment.setAppointmentTime(app.getAppointmentTime());
        return appointmentService.booAppointments(appointment);
    }

    // fetch details using doctor id
    @GetMapping("/doctor/{doctorId}")
    public Doctor getDoctor(@PathVariable Long doctorId) {
        Doctor doctor = doctorService.getDoctorById(doctorId);
        return appointmentService.getDoctor(doctor);
    }

    // fetch details using patient id
    @GetMapping("/patient/{patientId}")
    public Patient getPatient(@PathVariable Long patientId) {
        Patient patient = patientService.getPatientById(patientId);
        return appointmentService.getPatient(patient);
    }

}
