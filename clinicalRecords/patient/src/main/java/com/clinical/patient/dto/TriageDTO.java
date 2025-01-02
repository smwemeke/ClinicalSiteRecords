package com.clinical.patient.dto;

public record TriageDTO(
        String pressure,
        Float temp,
        Integer pulseRate,
        Integer respirationRate

) {
}
