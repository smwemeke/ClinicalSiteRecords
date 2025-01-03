package com.clinical.patient.service;

import com.clinical.patient.dto.PatientDTO;

import java.util.List;
import java.util.Optional;

public interface PatientService {
      Optional<PatientDTO> registerPatient(PatientDTO patientRequestDTO);
      List<PatientDTO> getAllPatients();
      void deletePatientById(Long patientId);
      PatientDTO updatePatientTriage(PatientDTO patientDTO, Long patientId);
}
