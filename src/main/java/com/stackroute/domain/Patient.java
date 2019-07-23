package com.stackroute.domain;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Date;

@NodeEntity
public class Patient {

    private  String patientName;

    private  String gender;
    @Id
    private  String patientEmail;
    private  Long patientPhone;
    private  String patientCity;
    private  String patientArea;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public Long getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(Long patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientCity() {
        return patientCity;
    }

    public void setPatientCity(String patientCity) {
        this.patientCity = patientCity;
    }

    public String getPatientArea() {
        return patientArea;
    }

    public void setPatientArea(String patientArea) {
        this.patientArea = patientArea;
    }


    public Patient(String patientName, String gender, String patientEmail, Long patientPhone, String patientCity, String patientArea) {
        this.patientName = patientName;

        this.gender = gender;
        this.patientEmail = patientEmail;
        this.patientPhone = patientPhone;
        this.patientCity = patientCity;
        this.patientArea = patientArea;
    }


    @Override
    public String toString() {
        return "Patient{" +
                "patientName='" + patientName + '\'' +

                ", gender='" + gender +
                ", patientEmail='" + patientEmail + '\'' +
                ", patientPhone=" + patientPhone +
                ", patientCity='" + patientCity + '\'' +
                ", patientArea='" + patientArea + '\'' +
                '}';
    }


}









