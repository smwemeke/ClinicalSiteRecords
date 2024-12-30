package com.clinical.patient.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "patients")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "patientId")
    private Long patientId;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String contactInfo;
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinColumn(name = "addressid")
    private Address address;
    @OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    private Triage triage;
    private String studyName;

    public Patient( String firstName,
                    String lastName,
                    int age,
                    String gender,
                    String contactInfo,
                    Address address,
                    String studyName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.contactInfo = contactInfo;
        this.address = address;
        this.studyName = studyName;
    }
}