package com.clinical.patient.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "triage")
@NoArgsConstructor
@AllArgsConstructor
@Data
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
