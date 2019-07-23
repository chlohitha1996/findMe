package com.stackroute.controller;

import com.stackroute.domain.Doctor;
import com.stackroute.service.DoctorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/rest/neo4j")
public class DoctorController {

    @Autowired
    DoctorServiceImpl doctorService;
    private Doctor doctor;

    @GetMapping("doctors")
    public Collection<Doctor> getAll(){
        return doctorService.getAll();
    }


    @PostMapping("doctorsave")
    public Doctor saveDoctor(@RequestBody Doctor doctor) {

        return  doctorService.saveDoctor(doctor.getDoctorMail(),doctor.getDoctorName(),doctor.getDoctorGender(),doctor.getPhone(),
                doctor.getClinicName(),doctor.getSpecialization(),doctor.getClinicState(),doctor.getClinicCity(),

                doctor.getClinicFlatNo(),doctor.getClinicArea());

    }

    @PutMapping("doctorupdate/{doctorMail}")
    public Doctor updateDoctor(@RequestBody Doctor doctor,@PathVariable String doctorMail){
        this.doctor = doctor;
        return doctorService.updateDoctor(doctor,doctorMail);
    }

    @GetMapping("doctorname/{name}")
    public  Doctor getDoctor(@PathVariable String name){
        return  doctorService.getByName(name);
    }

    @DeleteMapping("doctordelete/{doctorMail}")
    public String deleteDoctor1(@PathVariable String doctorMail) {
        doctorService.deleteDoctor(doctorMail);
        return "Deleted Doctor";
    }

}
