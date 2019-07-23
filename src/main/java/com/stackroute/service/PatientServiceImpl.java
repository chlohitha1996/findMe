package com.stackroute.service;

import com.stackroute.domain.Patient;
import com.stackroute.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    PatientRepository patientRepository;

    private Patient patient;

    public PatientServiceImpl(PatientRepository patientRepository){
        this.patientRepository =patientRepository;
    }

    @Override

    public Patient savePatient(Patient patient)

    {
        Patient  savedpatient=null;

        savedpatient=patientRepository.createNode(patient.getPatientName(),patient.getPatientDOB(),

                                                   patient.getGender(),patient.getPatientEmail(),
                                                    patient.getPatientPhone(),patient.getPatientCity(),
                                                     patient.getPatientArea());

        System.out.println(savedpatient);

        return  savedpatient;

    }

    @Override
    public Collection<Patient>getAll()
    {

        return patientRepository.getAllPatients();

    }

    @Override
    public void deletePatient(String patientEmail)
    {

        patientRepository.deleteNode(patientEmail);
    }

    @Override
    public Patient updatePatient(Patient patient,String patientEmail)
    {

        return patientRepository.updateNode(patient.getPatientName(),patient.getPatientDOB(),

                patient.getGender(),patient.getPatientEmail(),
                patient.getPatientPhone(),patient.getPatientCity(),
                patient.getPatientArea());
    }

    @Override
    public Patient getByName(String name) {
        return  patientRepository.getNode(name);
    }

    @Override
    public Patient saveRelation(String pname,String dname) {
        return patientRepository.createRelation(pname,dname);
    }





}













