package com.clinical.doctor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "diagnosis")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Diagnosis {
    @Id
    @GeneratedValue (strategy =  GenerationType.SEQUENCE)
    @Column(name = "diagnosisid")
    private Long diagnosisId;
    private Long patientId;
    private Long visitId;
    private String diagnosisDetails;
    private String prescription;
    private LocalDateTime recordedTime;

}
