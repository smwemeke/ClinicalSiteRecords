package com.clinical.doctor.dto.mapper;

import com.clinical.doctor.dto.DiagnosisDTO;
import com.clinical.doctor.model.Diagnosis;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class DiagnosisMapper {

    public Diagnosis toDiagnosis(DiagnosisDTO diagnosisDTO){
        if(diagnosisDTO == null){
            return null;
        }
        return Diagnosis.builder()
                .patientId(diagnosisDTO.patientId())
                .visitId(diagnosisDTO.visitId())
                .diagnosisDetails(diagnosisDTO.diagnosisDetails())
                .prescription(diagnosisDTO.prescription())
                .recordedTime(diagnosisDTO.recordedTime())
                .build();
    }

    public DiagnosisDTO toDiagnosisDTO(Diagnosis diagnosis){
        if(diagnosis == null){
            return null;
        }
        return new DiagnosisDTO(
                diagnosis.getDiagnosisId(),
                diagnosis.getPatientId(),
                diagnosis.getVisitId(),
                diagnosis.getDiagnosisDetails(),
                diagnosis.getPrescription(),
                diagnosis.getRecordedTime()
        );
    }
}