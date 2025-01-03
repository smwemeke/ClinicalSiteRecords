package com.clinical.doctor.dto;

import java.time.LocalDateTime;

public record DiagnosisDTO(
        Long diagnosisId,
        Long patientId,
        Long visitId,
        String diagnosisDetails,
        String prescription,
        LocalDateTime recordedTime
) {
}
