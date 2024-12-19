package com.clinical.patient.dto.response;

import com.clinical.patient.dto.request.AddressRequestDTO;

public record PatientResponseDTO(
        String patientId,
        String firstName,
        String lastName,
        String gender,
        String contactInfo,
        AddressRequestDTO addressRequestDTO,
        String studyName
) {
}
