package com.clinical.patient.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "triage")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Triage {

    @Id
    @GeneratedValue (strategy =  GenerationType.SEQUENCE)
    @Column(name = "triageid")
    private Long triageId;
    private String pressure;
    private float temp;
    private Integer pulseRate;
    private Integer respirationRate;
}
