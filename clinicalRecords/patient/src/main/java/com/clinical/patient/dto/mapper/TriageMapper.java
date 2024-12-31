package com.clinical.patient.dto.mapper;

import com.clinical.patient.dto.TriageDTO;
import com.clinical.patient.model.Triage;
import org.springframework.stereotype.Service;

@Service
public class TriageMapper {

    public Triage toTriage(TriageDTO triageDTO){
        if(triageDTO == null){
            return null;
        }

        return Triage.builder()
                .pressure(triageDTO.pressure())
                .temp(triageDTO.temp())
                .pulseRate(triageDTO.pulseRate())
                .respirationRate(triageDTO.respirationRate())
                .build();
    }

    public TriageDTO toTriageDTO(Triage triage){
        if(triage == null){
            return null;
        }

        return new TriageDTO(
                triage.getPressure(),
                triage.getTemp(),
                triage.getPulseRate(),
                triage.getRespirationRate()
        );
    }
}
