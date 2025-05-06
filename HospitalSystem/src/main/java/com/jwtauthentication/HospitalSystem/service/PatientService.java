package com.jwtauthentication.HospitalSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwtauthentication.HospitalSystem.model.Patient;
import com.jwtauthentication.HospitalSystem.repository.PatientRepo;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    // Add patient
    public Patient addPatient(Patient patient) {
        return patientRepo.save(patient);
    }

    // Get patient details
    public List<Patient> getPatient() {
        return patientRepo.findAll();
    }

    public Patient getPatientById(long patientId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPatientById'");
    }

}
