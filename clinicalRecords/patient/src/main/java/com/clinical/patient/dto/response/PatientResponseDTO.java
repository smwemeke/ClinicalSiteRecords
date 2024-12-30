package com.clinical.patient.dto.response;

public record PatientResponseDTO(
        Long patientId,
        String firstName,
        String lastName,
        String gender,
        String contactInfo,
        AddressResponseDTO addressResponseDTO,
        String studyName
) {
}
