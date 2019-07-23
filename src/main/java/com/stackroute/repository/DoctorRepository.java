package com.stackroute.repository;

import com.stackroute.domain.Doctor;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface DoctorRepository  extends Neo4jRepository<Doctor,String>{



    @Query("MATCH (d:Doctor) RETURN d")
    Collection<Doctor> getAllDoctors();

    @Query("CREATE (d:Doctor) SET d.doctorMail={doctorMail},d.doctorName={doctorName}," +
                                  "d.doctorGender={doctorGender},d.phone={phone}," +
                                  "d.clinicName={clinicName},d.Specialization={Specialization}," +
                                  "d.clinicState={clinicState}," +
                                  "d.clinicCity={clinicCity},d.clinicFlatNo={clinicFlatNo}," +
                                  "d.clinicArea={clinicArea} RETURN d")
      public Doctor createNode( String doctorMail,
                                String doctorName,
                                String doctorGender,
                                Long phone,
                                String clinicName,
                                String Specialization,

                                String clinicState,
                                String clinicCity,
                                String clinicFlatNo,
                                String clinicArea
                               );



    @Query("MATCH (d:Doctor) WHERE  d.doctorMail={doctorMail} SET d.doctorName={doctorName}," +
            "d.doctorGender={doctorGender},d.phone={phone}," +
            "d.clinicName={clinicName},d.Specialization={Specialization}," +
            "d.clinicState={clinicState}," +
            "d.clinicCity={clinicCity},d.clinicFlatNo={clinicFlatNo}," +
            "d.clinicArea={clinicArea} RETURN d")
    public Doctor updateNode(@Param("doctorMail")String doctorMail, @Param("doctorName") String doctorName,
                             @Param("doctorGender")String doctorGender, @Param("phone")  Long phone,
                             @Param("clinicName")String clinicName, @Param("Specialization") String Specialization,
                            @Param("clinicState") String clinicState,
                             @Param("clinicCity")String clinicCity, @Param("clinicFlatNo") String clinicFlatNo,
                             @Param("clinicArea")String clinicArea);


       @Query("MATCH (d:Doctor) WHERE d.doctorName={doctorName} RETURN d")
       public Doctor getNode(@Param("doctorName") String doctorName);









   @Query("MATCH (d:Doctor) WHERE d.doctorMail={doctorMail} DETACH DELETE d RETURN 'node deleted' ")
    public  Doctor deleteNode(String doctorMail);

}

