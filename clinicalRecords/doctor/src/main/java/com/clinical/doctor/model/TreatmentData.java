package com.clinical.doctor.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "treatment")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TreatmentData {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    @Column(name = "treatmentid")
    private Long treatmentId;
    private String interventionDettails;
    private String dosage;
    private String sideEffects;
    private LocalDateTime recordedTime;
}
