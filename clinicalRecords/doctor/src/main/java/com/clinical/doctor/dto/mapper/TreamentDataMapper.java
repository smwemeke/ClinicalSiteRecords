package com.clinical.doctor.dto.mapper;

import com.clinical.doctor.dto.TreatmentDataDTO;
import com.clinical.doctor.model.TreatmentData;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TreamentDataMapper {

    public TreatmentData toTreatmentData(TreatmentDataDTO treatmentDataDTO){
        if(treatmentDataDTO == null){
            return null;
        }

        return TreatmentData.builder()
                .interventionDettails(treatmentDataDTO.interventionDettails())
                .dosage(treatmentDataDTO.dosage())
                .sideEffects(treatmentDataDTO.sideEffects())
                .recordedTime(treatmentDataDTO.recordedTime())
                .build();
    }

    public  TreatmentDataDTO toTreatmentDataDTO(TreatmentData treatmentData){
        if(treatmentData == null){
            return null;
        }

        return new TreatmentDataDTO(
                treatmentData.getTreatmentId(),
                treatmentData.getInterventionDettails(),
                treatmentData.getDosage(),
                treatmentData.getSideEffects(),
                treatmentData.getRecordedTime()
        );
    }
}
