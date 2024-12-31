package com.clinical.patient.dto;

public record TriageDTO(
        String pressure,
        float temp,
        Integer pulseRate,
        Integer respirationRate

) {
}
