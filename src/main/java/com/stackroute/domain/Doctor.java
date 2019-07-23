package com.stackroute.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Date;

@NodeEntity
public class Doctor {



    @Id
        private String doctorMail;
        private  String doctorName;
        private String doctorGender;
        private Long phone;
        private  String clinicName;
        private String Specialization;
        private Date practiceStartDate;
        private String clinicState;
        private String clinicCity;
        private String clinicFlatNo;
        private String clinicArea;
        private int clinicPinCode;

    public String getDoctorMail() {
        return doctorMail;
    }

    public void setDoctorMail(String doctorMail) {
        this.doctorMail = doctorMail;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorGender() {
        return doctorGender;
    }

    public void setDoctorGender(String doctorGender) {
        this.doctorGender = doctorGender;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    public Date getPracticeStartDate() {
        return practiceStartDate;
    }

    public void setPracticeStartDate(Date practiceStartDate) {
        this.practiceStartDate = practiceStartDate;
    }

    public String getClinicState() {
        return clinicState;
    }

    public void setClinicState(String clinicState) {
        this.clinicState = clinicState;
    }

    public String getClinicCity() {
        return clinicCity;
    }

    public void setClinicCity(String clinicCity) {
        this.clinicCity = clinicCity;
    }

    public String getClinicFlatNo() {
        return clinicFlatNo;
    }

    public void setClinicFlatNo(String clinicFlatNo) {
        this.clinicFlatNo = clinicFlatNo;
    }

    public String getClinicArea() {
        return clinicArea;
    }

    public void setClinicArea(String clinicArea) {
        this.clinicArea = clinicArea;
    }

    public int getClinicPinCode() {
        return clinicPinCode;
    }

    public void setClinicPinCode(int clinicPinCode) {
        this.clinicPinCode = clinicPinCode;
    }

    public Doctor(String doctorMail, String doctorName, String doctorGender, Long phone, String clinicName, String specialization, Date practiceStartDate, String clinicState, String clinicCity, String clinicFlatNo, String clinicArea, int clinicPinCode)
        {
            this.doctorMail = doctorMail;
            this.doctorName = doctorName;
            this.doctorGender = doctorGender;
            this.phone = phone;
            this.clinicName = clinicName;
            Specialization = specialization;
            this.practiceStartDate = practiceStartDate;
            this.clinicState = clinicState;
            this.clinicCity = clinicCity;

            this.clinicFlatNo = clinicFlatNo;
            this.clinicArea = clinicArea;
            this.clinicPinCode = clinicPinCode;
        }






    @Override
    public String toString() {
        return "Doctor{" +
                "doctorMail='" + doctorMail + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", doctorGender='" + doctorGender + '\'' +
                ", phone=" + phone +
                ", clinicName='" + clinicName + '\'' +
                ", Specialization='" + Specialization + '\'' +
                ", practiceStartDate=" + practiceStartDate +
                ", clinicState='" + clinicState + '\'' +
                ", clinicCity='" + clinicCity + '\'' +
                ", clinicFlatNo='" + clinicFlatNo + '\'' +
                ", clinicArea='" + clinicArea + '\'' +
                ", clinicPinCode=" + clinicPinCode +
                '}';
    }


      }









