package com.jwtauthentication.HospitalSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwtauthentication.HospitalSystem.model.Doctor;
import com.jwtauthentication.HospitalSystem.repository.DoctorRepo;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepo doctorRepo;

    // Getting list
    public List<Doctor> allDoctor() {
        return doctorRepo.findAll();
    }

    // Add doctor
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepo.save(doctor);
    }

    public Doctor getDoctorById(long doctorId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDoctorById'");
    }

}
