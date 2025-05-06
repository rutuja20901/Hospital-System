package com.jwtauthentication.HospitalSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwtauthentication.HospitalSystem.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Long> {

}
