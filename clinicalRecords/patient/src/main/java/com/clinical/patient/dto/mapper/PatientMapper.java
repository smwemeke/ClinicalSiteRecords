package com.clinical.patient.dto.mapper;

import com.clinical.patient.dto.AddressDTO;
import com.clinical.patient.dto.PatientDTO;
import com.clinical.patient.dto.TriageDTO;
import com.clinical.patient.model.Address;
import com.clinical.patient.model.Patient;
import com.clinical.patient.model.Triage;
import org.springframework.stereotype.Service;

@Service
public class PatientMapper {

    public Patient toPatient(PatientDTO patientDTO){
        if(patientDTO == null){
            return null;
        }

        return Patient.builder()
                .firstName(patientDTO.firstName())
                .lastName(patientDTO.lastName())
                .age(patientDTO.age())
                .gender(patientDTO.gender())
                .contactInfo(patientDTO.contactInfo())
                .address(Address.builder()
                        .city(patientDTO.addressDTO().city())
                        .street(patientDTO.addressDTO().street())
                        .build())
                .triage(Triage.builder()
                        .pressure(patientDTO.triageDTO().pressure())
                        .temp(patientDTO.triageDTO().temp())
                        .pulseRate(patientDTO.triageDTO().pulseRate())
                        .respirationRate(patientDTO.triageDTO().respirationRate())
                        .build())
                .studyName(patientDTO.studyName())
                .build();
    }

    public PatientDTO toPatientDTO (Patient patient){
        if(patient == null){
            return null;
        }
        return new PatientDTO(
                patient.getPatientId(),
                patient.getFirstName(),
                patient.getLastName(),
                patient.getAge(),
                patient.getGender(),
                patient.getContactInfo(),
                new AddressDTO(
                        patient.getAddress().getStreet(),
                        patient.getAddress().getCity()
                ),
                new TriageDTO(
                        patient.getTriage().getPressure(),
                        patient.getTriage().getTemp(),
                        patient.getTriage().getPulseRate(),
                        patient.getTriage().getRespirationRate()),
                patient.getStudyName()
        );
    }
}
