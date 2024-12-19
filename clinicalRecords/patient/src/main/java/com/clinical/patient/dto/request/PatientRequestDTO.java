package com.clinical.patient.dto.request;

public record PatientRequestDTO(
         String firstName,
         String lastName,
         int age,
         String gender,
         String contactInfo,
         AddressRequestDTO addressRequestDTO,
         String studyName
) {
}
