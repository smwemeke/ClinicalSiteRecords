package com.clinical.doctor.dto;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record MedicalHistoryDTO(
        Long histroyId,
        Long patientId,
        String allegies,
        LocalDateTime lastUpdated
) {
}
