package com.clinical.patient.service.impl;

import com.clinical.patient.dto.mapper.TriageMapper;
import com.clinical.patient.exception.PatientNotFoundException;
import com.clinical.patient.dto.AddressDTO;
import com.clinical.patient.dto.mapper.PatientMapper;
import com.clinical.patient.dto.PatientDTO;
import com.clinical.patient.dto.TriageDTO;
import com.clinical.patient.model.Patient;
import com.clinical.patient.model.Triage;
import com.clinical.patient.repository.PatientRepository;
import com.clinical.patient.repository.TriageRepository;
import com.clinical.patient.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;
    private final TriageRepository triageRepository;
    private final PatientMapper patientMapper;
    private final TriageMapper triageMapper;

    @Override
    public Optional<PatientDTO> registerPatient(PatientDTO patientRequestDTO) {
        // create new patient
        Patient newPatient = patientMapper.toPatient(patientRequestDTO);
        //save patient
        Patient savedPatient = patientRepository.save(newPatient);

        PatientDTO responseDTO = patientMapper.toPatientDTO(savedPatient);

        return Optional.of(responseDTO);
    }

    @Override
    public List<PatientDTO> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();

        return patients.stream()
                .map(patient -> new PatientDTO(
                        patient.getPatientId(),
                        patient.getFirstName(),
                        patient.getLastName(),
                        patient.getAge(),
                        patient.getGender(),
                        patient.getContactInfo(),
                        new AddressDTO(
                                patient.getAddress().getCity(),
                                patient.getAddress().getStreet()),
                        new TriageDTO(
                                patient.getTriage().getPressure(),
                                patient.getTriage().getTemp(),
                                patient.getTriage().getPulseRate(),
                                patient.getTriage().getRespirationRate()
                        ),
                        patient.getStudyName()

                )).toList();
    }

    @Override
    public void deletePatientById(Long patientId) {
      Optional<Patient> foundPatient = patientRepository.findById(patientId);
      if(foundPatient.isPresent()){
          patientRepository.deleteById(patientId);
      } else {
          throw new PatientNotFoundException(patientId + "not found");
      }
    }
    @Override
    public Optional<TriageDTO> registerTriage(TriageDTO triageRequest) {

        // create Triage
        Triage triage = triageMapper.toTriage(triageRequest);

        // save triage
        Triage savedTriage = triageRepository.save(triage);

        TriageDTO triageDTO = triageMapper.toTriageDTO(savedTriage);
        return Optional.of(triageDTO);
    }
}
