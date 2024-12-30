package com.clinical.patient.service.impl;

import com.clinical.patient.dto.mapper.PatientRequestMapper;
import com.clinical.patient.dto.mapper.PatientResponseMapper;
import com.clinical.patient.dto.request.PatientRequestDTO;
import com.clinical.patient.dto.response.PatientResponseDTO;
import com.clinical.patient.model.Patient;
import com.clinical.patient.repository.PatientRepository;
import com.clinical.patient.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final PatientRequestMapper requestMapper;
    private final PatientResponseMapper responseMapper;
    @Override
    public Optional<PatientResponseDTO> registerPatient(PatientRequestDTO patientRequestDTO) {
        // create new patient
        Patient newPatient = requestMapper.toPatient(patientRequestDTO);
        //save patient
        Patient savedPatient = patientRepository.save(newPatient);

        PatientResponseDTO responseDTO = responseMapper.toPatientResponseDTO(savedPatient);

        return Optional.of(responseDTO);
    }

    @Override
    public List<PatientResponseDTO> getAllPatients() {
        return List.of();
    }

    @Override
    public void deletePatient() {

    }

    @Override
    public Optional<PatientResponseDTO> updatePatient(String patientId) {
        return Optional.empty();
    }
}
