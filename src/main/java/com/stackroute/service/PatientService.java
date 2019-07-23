package com.stackroute.service;

import com.stackroute.domain.Patient;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public interface PatientService {
   public Patient savePatient(Patient patient);


    public Collection<Patient> getAll();

    public void deletePatient(String patientEmail);

    public Patient updatePatient(Patient patient,String patientEmail);

    public Patient getByName(String patientName);

    public Patient saveRelation(String patientEmail,String doctorEmail);
}
