package com.clinical.doctor.dto;

import java.time.LocalDateTime;

public record TreatmentDataDTO(
        Long treatmentId,
        String interventionDettails,
        String dosage,
        String sideEffects,
        LocalDateTime recordedTime
) {
}
