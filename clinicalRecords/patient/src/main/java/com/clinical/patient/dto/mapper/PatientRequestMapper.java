package com.clinical.patient.dto.mapper;

import com.clinical.patient.dto.request.PatientRequestDTO;
import com.clinical.patient.model.Address;
import com.clinical.patient.model.Patient;
import org.springframework.stereotype.Service;

@Service
public class PatientRequestMapper {

    public Patient toPatient(PatientRequestDTO patientRequest){
        if(patientRequest == null){
            return null;
        }
        return new Patient(
                patientRequest.firstName(),
                patientRequest.lastName(),
                patientRequest.age(),
                patientRequest.gender(),
                patientRequest.contactInfo(),
                new Address(
                  patientRequest.addressRequestDTO().city(),
                  patientRequest.addressRequestDTO().street()
                ),
                patientRequest.studyName()
        );
    }
}
