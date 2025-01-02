package com.clinical.doctor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "history")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class MedicalHistory {
    private Long histroyId;
    private Long patientId;
    private String allegies;
    private LocalDateTime lastUpdated;
}
