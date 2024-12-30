package com.clinical.patient.dto.mapper;

import com.clinical.patient.dto.response.AddressResponseDTO;
import com.clinical.patient.dto.response.PatientResponseDTO;
import com.clinical.patient.model.Patient;
import org.springframework.stereotype.Service;

@Service
public class PatientResponseMapper {
    public PatientResponseDTO toPatientResponseDTO(Patient patient){
        if(patient == null){
            return null;
        }
        return new PatientResponseDTO(
                patient.getPatientId(),
                patient.getFirstName(),
                patient.getLastName(),
                patient.getGender(),
                patient.getContactInfo(),
                new AddressResponseDTO(
                        patient.getAddress().getStreet(),
                        patient.getAddress().getCity()
                ),
                patient.getStudyName()
        );
    }
}
