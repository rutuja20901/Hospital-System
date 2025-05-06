package com.jwtauthentication.HospitalSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwtauthentication.HospitalSystem.model.Appointments;
import com.jwtauthentication.HospitalSystem.model.Doctor;
import com.jwtauthentication.HospitalSystem.model.Patient;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointments, Long> {

    Doctor findByDoctor(Doctor doctor);

    Patient findByPatient(Patient patient);

}
