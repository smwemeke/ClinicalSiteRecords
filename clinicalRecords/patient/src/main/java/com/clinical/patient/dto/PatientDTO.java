package com.clinical.patient.dto;

public record PatientDTO(
         Long patientId,
         String firstName,
         String lastName,
         int age,
         String gender,
         String contactInfo,
         AddressDTO addressDTO,
         TriageDTO triageDTO,
         String studyName
) {
}
