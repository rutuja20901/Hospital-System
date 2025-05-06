package com.jwtauthentication.HospitalSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwtauthentication.HospitalSystem.model.Doctor;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long> {

}
