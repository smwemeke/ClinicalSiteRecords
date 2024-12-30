package com.clinical.patient.service;

import com.clinical.patient.dto.request.PatientRequestDTO;
import com.clinical.patient.dto.response.PatientResponseDTO;

import java.util.List;
import java.util.Optional;

public interface PatientService {
      Optional<PatientResponseDTO> registerPatient(PatientRequestDTO patientRequestDTO);
      List<PatientResponseDTO> getAllPatients();
      void deletePatient();
      Optional<PatientResponseDTO> updatePatient(String patientId);
}
