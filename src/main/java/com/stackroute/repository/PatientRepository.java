package com.stackroute.repository;

import com.stackroute.domain.Patient;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Date;

@Repository
public interface PatientRepository extends Neo4jRepository<Patient, String>{

        @Query("MATCH (p:Patient)<-[r:VISITS]-(d:Doctor) RETURN p,r,d")
        Collection<Patient> getAllPatients();


        @Query("CREATE (u:Patient) SET u.patientName={patientName},u.gender={gender} ,u.patientEmail={patientEmail},u.patientPhone={patientPhone},u.patientCity={patientCity},u.patientArea={patientArea}RETURN u")
         Patient createNode( String patientName,String gender, String patientEmail,Long patientPhone, String patientCity,String patientArea);




        @Query("MATCH (n:Patient) WHERE id(n)={patientEmail} DETACH DELETE n RETURN 'node deleted'")
        Patient deleteNode(String patientEmail);






       @Query("MATCH (p:Patient) WHERE p.patientName={patientName} RETURN p")
        public Patient getNode(@Param("patientName") String patientName);



       @Query("MATCH (n:Patient) WHERE n.patientEmail={patientEmail} SET n.patientName={patientName},n.gender={gender}," +
               "n.patientPhone={patientPhone},n.patientCity={patientCity},n.patientArea={patientArea} RETURN n")
       public Patient updateNode(@Param("patientName") String  patientName,
                                 @Param("gender") String  gender, @Param("patientEmail") String  patientEmail,
                                 @Param("patientPhone") Long patientPhone, @Param("patientCity") String  patientCity,
                                 @Param("patientArea") String patientArea);


        @Query("MATCH (a:Patient),(b:Doctor) WHERE a.patientName={patientname} and b.doctorName={doctorname} CREATE (a)-[r:VISITS]->(b) RETURN a")
        public Patient createRelation(@Param("patientname") String patientName, @Param("doctorname") String doctorName);

    }
