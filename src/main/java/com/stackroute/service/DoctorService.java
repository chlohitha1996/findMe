package com.stackroute.service;


import com.stackroute.domain.Doctor;

import java.util.Collection;
import java.util.Date;

public interface DoctorService {

     Collection<Doctor> getAll();



     Doctor saveDoctor( String doctorMail,
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
                              int clinicPinCode);

    public Doctor updateDoctor(Doctor doctor,String doctorMail);

    public Doctor getByName(String doctorName);

    public void deleteDoctor(String doctorMail);


}
