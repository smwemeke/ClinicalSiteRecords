package com.clinical.doctor.dto;

import java.time.LocalDateTime;

public record MedicalHistoryDTO(
        Long histroyId,
        Long patientId,
        String allegies,
        LocalDateTime lastUpdated
) {
}
