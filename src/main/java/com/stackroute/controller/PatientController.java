package com.stackroute.controller;
import com.stackroute.domain.Patient;
import com.stackroute.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/rest/neo4j/patient")
public class PatientController {

    @Autowired
    PatientService  patientService;



    @GetMapping("patients")
    public Collection<Patient>getAll()
    {

        return patientService.getAll();

    }


    @PostMapping("patientsave")
    public Patient savePatient(@RequestBody Patient patient) {
        Patient patient1 = null;
        patient1 = patientService.savePatient(patient);
        System.out.println(patient1.getPatientName());
        return patient1;

    }

    @PutMapping("patientupdate/{email}")
    public Patient updatePatient(@RequestBody Patient patient,@PathVariable String email){
        return patientService.updatePatient(patient,email);
    }

    @GetMapping("patientname/{patientName}")
    public  Patient getPatient(@PathVariable String patientName){
        return patientService.getByName(patientName);
    }

    @DeleteMapping("patientdelete/{patientEmail}")
    public String deletePatient(@PathVariable String patientEmail) {
        patientService.deletePatient(patientEmail);
        return "Deleted Patient";
    }

    @PostMapping("graph/{patientname}/{doctorname}")
    public Patient saveRelation(@PathVariable String patientname,@PathVariable String doctorname){

        return  patientService.saveRelation(patientname,doctorname);
    }

}
