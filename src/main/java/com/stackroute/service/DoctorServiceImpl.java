package com.stackroute.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.stackroute.domain.Doctor;
import com.stackroute.repository.DoctorRepository;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Date;

@Service
public class DoctorServiceImpl implements DoctorService {


    DoctorRepository doctorRepository;

    @Autowired
    public DoctorServiceImpl(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @Override
    public Collection<Doctor> getAll() {
        return doctorRepository.getAllDoctors();
    }


    @Override
    public Doctor saveDoctor(String doctorMail,
                             String doctorName,
                             String doctorGender,
                             Long phone,
                             String clinicName,
                             String Specialization,
                             Date practiceStartDate,
                             String clinicState,
                             String clinicCity,
                             String clinicFlatNo,
                             String clinicArea,
                             int clinicPinCode) {


        Doctor savedDoctor = null;
        savedDoctor = doctorRepository.createNode(doctorMail, doctorName, doctorGender, phone, clinicName, Specialization, practiceStartDate, clinicState,
                clinicCity, clinicFlatNo, clinicArea, clinicPinCode);
        System.out.println(savedDoctor);
        return savedDoctor;

    }

    @Override
    public Doctor updateDoctor(Doctor doctor, String doctorMail) {
        return doctorRepository.updateNode(doctorMail, doctor.getDoctorName(), doctor.getDoctorGender(), doctor.getPhone(),
                doctor.getClinicName(), doctor.getSpecialization(), doctor.getPracticeStartDate(),
                doctor.getClinicState(), doctor.getClinicCity(), doctor.getClinicFlatNo(), doctor.getClinicArea(),
                doctor.getClinicPinCode());


    }


    @Override
    public Doctor getByName(String name) {
        return doctorRepository.getNode(name);
                             }



    @Override
  public void deleteDoctor(String doctorMail) {

      doctorRepository.deleteNode(doctorMail);
   }
}






