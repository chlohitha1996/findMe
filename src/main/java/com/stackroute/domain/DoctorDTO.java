package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.NodeEntity;
import org.springframework.data.annotation.Id;

@NodeEntity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDTO {

    @Id
    private String emailId;
    private String role;
    private String name;
    private String gender;
    private String profileImage;
    private String qualification;
    private String specialization;
    private String clinicName;
    private Address address;

}
